package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.kit.scc.cfeditor.cfengine.cfengine.AbstractElement;
import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfModel;

/**
 * Handles interactions with .cf files and contained cf model elements.
 * 
 * @author Andreas Bender
 * 
 */
public class CfModelHandler extends ModelHandler {

	/**
	 * Returns a map of body class objects grouped by name which are contained in
	 * the given file list.
	 * <p>
	 * Design of the hash map:
	 * </p>
	 * <p>
	 * String : String -> EObject<br>
	 * (class name: URI -> class object)
	 * </p>
	 * <p>
	 * "classA" : file URI (String) of body class object 1 with name "classA" -> body class object 1<br>
	 *            file URI (String) of body class object 2 with name "classA" -> body class object 2<br>	
	 *            ...
	 * </p>
	 * <p>                   
	 * "classB" : ...
	 * </p>
	 * ...
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return sorted map (see description)
	 */
	public HashMap<String, HashMap<String, EObject>> getSortedBodyClasses(LinkedList<String> uriList) {
		return getSortedBodyClasses(getResourcesMap(uriList));
	}

	private HashMap<String, HashMap<String, EObject>> getSortedBodyClasses(HashMap<String, EObject> resourcesMap) {
		HashMap<String, HashMap<String, EObject>> bodyClassesMap = new HashMap<String, HashMap<String, EObject>>();

		CfModel cfModel;

		for (Entry<String, EObject> resource : resourcesMap.entrySet()) {
			cfModel = (CfModel) resource.getValue();

			EList<AbstractElement> elements = cfModel.getElements();

			for (AbstractElement abstractElement : elements) {
				if (abstractElement instanceof Body) {
					EList<BodyClass> classList = ((Body) abstractElement).getClasses();

					for (BodyClass bodyClass : classList) {
						if (bodyClassesMap.containsKey(bodyClass.getName())) {
							bodyClassesMap.get(bodyClass.getName()).put(resource.getKey(), bodyClass);
						} else {
							HashMap<String, EObject> tempMap = new HashMap<String, EObject>();
							tempMap.put(resource.getKey(), bodyClass);
							bodyClassesMap.put(bodyClass.getName(), tempMap);
						}
					}
				}
			}
		}

		return bodyClassesMap;
	}
}
