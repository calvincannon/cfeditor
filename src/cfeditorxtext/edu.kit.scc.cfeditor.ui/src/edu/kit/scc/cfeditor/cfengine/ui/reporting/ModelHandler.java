package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Handles interactions with files which contain model elements.
 * 
 * @author Andreas Bender
 * 
 */
public class ModelHandler {
	
	/**
	 * Returns a map of file URIs (as Strings) and corresponding resource
	 * objects.
	 * 
	 * @param uriList
	 *            list of file URIs (as Strings)
	 * @return the map of URIs and resource objects
	 */
	public HashMap<String, EObject> getResourcesMap(LinkedList<String> uriList) {
		HashMap<String, EObject> resourcesMap = new HashMap<String, EObject>();

		ResourceSet rs;
		Resource resource;

		for (String strURI : uriList) {
			rs = new ResourceSetImpl();
			resource = rs.getResource(URI.createURI(strURI), true);
			resourcesMap.put(strURI, resource.getContents().get(0));
			/*FIXME org.eclipse.emf.common.util.BasicEList$BasicIndexOutOfBoundsException: index=0, size=0
	at org.eclipse.emf.common.util.BasicEList.get(BasicEList.java:352)
	at edu.kit.scc.cfeditor.cfengine.ui.reporting.ModelHandler.getResourcesMap(ModelHandler.java:37) leere Datei!!!!*/
		}

		return resourcesMap;
	}
}
