package edu.kit.scc.cfeditor.ui.reporting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

import edu.kit.scc.cfeditor.cfeditor.BodyFunction;

/**
 * Builds the tree of classes and body function elements for the "Class View".
 * 
 * @author Andreas Bender
 * 
 */
public class ClassTreeBuilder {

	/**
	 * Returns an array of tree nodes which represent the tree of body classes
	 * and contained body functions.
	 * 
	 * @param activeProject
	 *            the active eclipse project in workspace
	 * @return array of the first level tree nodes
	 */
	public TreeNode[] getTreeNodes(IProject activeProject) {
		ArrayList<TreeNode> arrayList = new ArrayList<TreeNode>();

		FileHandler fileHandler = new FileHandler();
		LinkedList<String> uriList = fileHandler.getFileURIs(activeProject, "cf");

		CfModelHandler cfModelHandler = new CfModelHandler();

		CompositeNode node;
		for (Entry<String, HashMap<String, EObject>> classList : cfModelHandler.getSortedBodyClasses(uriList).entrySet()) {

			TreeNode classNode = new TreeNode(classList.getKey());

			ArrayList<TreeNode> children = new ArrayList<TreeNode>();

			for (Entry<String, EObject> classElement : classList.getValue().entrySet()) {
				for (EObject classContentObject : classElement.getValue().eContents()) {
					node = NodeUtil.getNode(classContentObject);
					TreeNode functionNode = new TreeNode(new BodyFunctionElement(classElement.getKey(),
							node.getOffset(), (BodyFunction) classContentObject));
					functionNode.setParent(classNode);
					children.add(functionNode);
				}
			}
			classNode.setChildren(children.toArray(new TreeNode[1]));
			arrayList.add(classNode);
		}

		return arrayList.toArray(new TreeNode[1]);
	}
}
