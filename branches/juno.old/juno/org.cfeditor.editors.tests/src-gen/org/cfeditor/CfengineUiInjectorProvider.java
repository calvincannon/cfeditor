/*
* generated by Xtext
*/
package org.cfeditor;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CfengineUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.cfeditor.ui.internal.CfengineActivator.getInstance().getInjector("org.cfeditor.Cfengine");
	}
	
}