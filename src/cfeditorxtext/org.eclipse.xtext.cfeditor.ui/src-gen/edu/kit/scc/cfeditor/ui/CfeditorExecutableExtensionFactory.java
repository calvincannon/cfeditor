
/*
 * generated by Xtext
 */
 
package edu.kit.scc.cfeditor.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class CfeditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return edu.kit.scc.cfeditor.ui.internal.CfeditorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return edu.kit.scc.cfeditor.ui.internal.CfeditorActivator.getInstance().getInjector("edu.kit.scc.cfeditor.Cfeditor");
	}
	
}