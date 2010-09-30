package edu.kit.scc.cfeditor.validation;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.validation.Check;

import edu.kit.scc.cfeditor.cfeditor.Body;
import edu.kit.scc.cfeditor.cfeditor.BodyClass;
import edu.kit.scc.cfeditor.cfeditor.BodyFunction;
import edu.kit.scc.cfeditor.cfeditor.BodyPromiseType;
import edu.kit.scc.cfeditor.cfeditor.Bundle;
import edu.kit.scc.cfeditor.cfeditor.BundlePromiseType;
import edu.kit.scc.cfeditor.cfeditor.CfeditorPackage;
import edu.kit.scc.cfeditor.definitions.CfDefinitionProvider;

/**
 * Cfengine code validator. Declares syntax checks which are automatically
 * performed when code in editor is changed.
 * 
 * @author Andreas Bender
 * 
 */
public class CfeditorJavaValidator extends AbstractCfeditorJavaValidator {

	private CfFunctionValidator functionValidator;

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
						CfeditorPackage.BUNDLE_PROMISE_TYPE__NAME);
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
						CfeditorPackage.BODY_PROMISE_TYPE__NAME);
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
		functionValidator = new CfFunctionValidator();
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
 //TODO BodyClass
		String errorString = functionValidator.checkBodyFunction(name, values, isList, variables);
		if (null != errorString) {
			warning(errorString, CfeditorPackage.BODY_FUNCTION__NAME);
		}
		// CfDefinitionProvider defProvider =
		// CfDefinitionProvider.getInstance();
		//
		//
		// if (defProvider.getBodyPromiseTypes().get(name).equals("int")) {
		// for (String value : values) {
		// try {
		// Integer.parseInt(value);
		// } catch (NumberFormatException e) {
		// error("Parameters of promise type \"" + name +
		// "\" have to be \"int\"",
		// CfeditorPackage.BODY_FUNCTION__NAME);
		// }
		// }
		// }

	}

	// @Check
	// public void checkPromiseTypes(PromiseType ptype) {
	// if (ptype.getName().equals("databases"))
	// warning("Databases not allowed!!!",
	// CfeditorPackage.PROMISE_TYPE__NAME);

	// HashMap<String, String[]> hmap=new HashMap<String, String[]>();
	// String[] stringarr={"abc","def","databases"};
	// hmap.put("var", stringarr);

	// LinkedList<String> alist=new LinkedList<String>();
	//
	// alist.add("abcd");
	// alist.add("abcde");
	// alist.add("abcdf");
	//
	// Map<String,LinkedList<String>> hamap=new HashMap<String,
	// LinkedList<String>>();
	// hamap.put("var", alist);
	// hamap.put("var2", alist);
	//
	// XMLEncoder enc = null;
	//
	// enc = new XMLEncoder(System.out);
	// enc.writeObject(hamap);
	// CompositeNode node = NodeUtil.getNode(ptype);
	// if(NodeUtil.findASTParentElement(node).getClass().getSimpleName().equals("Bundle")){
	// EObject eObj = NodeUtil.findASTParentElement(node);
	// if (eObj instanceof Bundle) {
	// Bundle bundle = (Bundle) eObj;
	// CfDefinitionProvider cfDefProvider = new CfDefinitionProvider();
	// HashMap<String,LinkedList<String>>
	// promiseMap=cfDefProvider.getBundleTypes();
	//
	// String pName=ptype.getName();
	// String compName=bundle.getComponent().getName();
	//
	// if(!promiseMap.get(compName).contains(pName)){
	// error("Promise type \""+pName+"\" not allowed with component \""+compName+"\"",
	// CfeditorPackage.PROMISE_TYPE__NAME);
	// }
	// for(String strName:promiseMap.get(pName)){
	// if(!strName.equals(pName)){
	//
	// }
	// }

	// System.out.println(bundle.getName());
	// }

	// CfDefinitionProvider cfDefProvider = new CfDefinitionProvider();
	// System.out.println(cfDefProvider.getBundleTypes("BundleTypes"));

	// }

	// @Check
	// public void checkPromisesByBundle(Bundle bundle) {
	// EList<PromiseType> lt = bundle.getPromiseType();
	// Boolean bool = false;
	// for (PromiseType pt : lt) {
	// if (pt.getName().equals("processes"))
	// bool = true;
	// }
	// if (bool)
	// warning("Processes not allowed!!!", CfeditorPackage.BUNDLE__NAME);
	// }
}
