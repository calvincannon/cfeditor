package org.eclipse.xtext.validation;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.cfeditor.Bundle;
import org.eclipse.xtext.cfeditor.CfeditorPackage;
import org.eclipse.xtext.cfeditor.PromiseType;
import org.eclipse.xtext.definitions.CfDefinitionProvider;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

public class CfeditorJavaValidator extends AbstractCfeditorJavaValidator {

	@Check
	public void checkPromiseTypes(PromiseType ptype) {
		CompositeNode node = NodeUtil.getNode(ptype);
		EObject eObj = NodeUtil.findASTParentElement(node);
		if (eObj instanceof Bundle) {
			Bundle bundle = (Bundle) eObj;
			CfDefinitionProvider cfDefProvider = new CfDefinitionProvider();
			HashMap<String,LinkedList<String>> promiseMap=cfDefProvider.getBundleTypes();
			
			String pName=ptype.getName();
			String compName=bundle.getComponent().getName();
			
			if(!promiseMap.get(compName).contains(pName)){
				error("Promise type \""+pName+"\" not allowed with component \""+compName+"\"",
						CfeditorPackage.PROMISE_TYPE__NAME);
			}
		}	
	}
	
//	@Check
//	public void checkPromiseTypes(PromiseType ptype) {
//		if (ptype.getName().equals("databases"))
//			warning("Databases not allowed!!!",
//					CfeditorPackage.PROMISE_TYPE__NAME);
		
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
//		CompositeNode node = NodeUtil.getNode(ptype);
		// if(NodeUtil.findASTParentElement(node).getClass().getSimpleName().equals("Bundle")){
//		EObject eObj = NodeUtil.findASTParentElement(node);
//		if (eObj instanceof Bundle) {
//			Bundle bundle = (Bundle) eObj;
//			CfDefinitionProvider cfDefProvider = new CfDefinitionProvider();
//			HashMap<String,LinkedList<String>> promiseMap=cfDefProvider.getBundleTypes();
//			
//			String pName=ptype.getName();
//			String compName=bundle.getComponent().getName();
//			
//			if(!promiseMap.get(compName).contains(pName)){
//				error("Promise type \""+pName+"\" not allowed with component \""+compName+"\"",
//						CfeditorPackage.PROMISE_TYPE__NAME);
//			}
//			for(String strName:promiseMap.get(pName)){
//				if(!strName.equals(pName)){
//					
//				}
//			}
			
			
			//System.out.println(bundle.getName());
//		}
		
//		CfDefinitionProvider cfDefProvider = new CfDefinitionProvider();
//		System.out.println(cfDefProvider.getBundleTypes("BundleTypes"));

//	}

//	@Check
//	public void checkPromisesByBundle(Bundle bundle) {
//		EList<PromiseType> lt = bundle.getPromiseType();
//		Boolean bool = false;
//		for (PromiseType pt : lt) {
//			if (pt.getName().equals("processes"))
//				bool = true;
//		}
//		if (bool)
//			warning("Processes not allowed!!!", CfeditorPackage.BUNDLE__NAME);
//	}
}
