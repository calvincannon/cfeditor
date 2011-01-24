package edu.kit.scc.cfeditor.cfengine.validation;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.validation.Check;

import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyClass;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyPromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.Bundle;
import edu.kit.scc.cfeditor.cfengine.cfengine.BundlePromiseType;
import edu.kit.scc.cfeditor.cfengine.cfengine.CfenginePackage;
import edu.kit.scc.cfeditor.cfengine.definitions.CfDefinitionProvider;

/**
 * Cfengine code validator. Declares syntax checks which are automatically
 * performed when code in editor is changed.
 * 
 * @author Andreas Bender
 * 
 */
public class CfengineEditorJavaValidator extends AbstractCfengineEditorJavaValidator {

	private CfengineEditorFunctionValidator functionValidator;

	/**
	 * Checks if promise type in bundle block is allowed with bundle component.
	 * 
	 * @param ptype
	 */
	@Check
	public void checkPromiseTypes(BundlePromiseType ptype) {
		CompositeNode node = NodeUtil.getNode(ptype);
		EObject eObj = NodeUtil.findASTParentElement(node);
		if (eObj instanceof Bundle) {
			Bundle bundle = (Bundle) eObj;
			CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
			HashMap<String, LinkedList<String>> promiseMap = cfDefProvider.getBundleTypes();

			String pName = ptype.getName();
			String compName = bundle.getComponent().getName();
			if (!promiseMap.get(compName).contains(pName)) {
				error("Promise type \"" + pName + "\" not allowed with component \"" + compName + "\"",
						CfenginePackage.BUNDLE_PROMISE_TYPE__NAME);
			}
		}
	}

	/**
	 * Checks if promise type in bundle block is allowed with bundle component.
	 * 
	 * @param ptype
	 */
	@Check
	public void checkPromiseTypes(BodyPromiseType ptype) {
		CompositeNode node = NodeUtil.getNode(ptype);
		EObject eObj = NodeUtil.findASTParentElement(node.getParent());
		
		if (eObj instanceof BodyClass) {
			node = NodeUtil.getNode(eObj);
			eObj = NodeUtil.findASTParentElement(node);
		}
		
		if (eObj instanceof Body) {
			Body body = (Body) eObj;
			CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
			HashMap<String, LinkedList<String>> promiseMap = cfDefProvider.getBodyFunctions();

			String pName = ptype.getName();
			String compName = body.getComponent().getName();
			if (!promiseMap.get(compName).contains(pName)) {
				error("Promise type \"" + pName + "\" not allowed with component \"" + compName + "\"",
						CfenginePackage.BODY_PROMISE_TYPE__NAME);
			}
		}
	}

	/**
	 * Checks if the value of a BodyFunction is valid.
	 * 
	 * @param function
	 */
	@Check
	public void checkBodyFunctionValues(BodyFunction function) {
		String name = function.getName().getName();
		EList<String> values = function.getValues();
		functionValidator = new CfengineEditorFunctionValidator();
		Boolean isList = function.isList();
		EList<String> variables = null;

		CompositeNode node = NodeUtil.getNode(function);
		EObject eObj = NodeUtil.findASTParentElement(node);
		
		if (eObj instanceof BodyClass) {
			node = NodeUtil.getNode(eObj);
			eObj = NodeUtil.findASTParentElement(node);
		}
		
		if (eObj instanceof Body) {
			Body body = (Body) eObj;
			variables = body.getVariables();
		}

		String errorString = functionValidator.checkBodyFunction(name, values, isList, variables);
		if (null != errorString) {
			warning(errorString, CfenginePackage.BODY_FUNCTION__NAME);
		}
	}
}
