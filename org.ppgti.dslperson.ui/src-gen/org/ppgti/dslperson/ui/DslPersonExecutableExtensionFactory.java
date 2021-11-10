/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.ppgti.dslperson.ui.internal.DslpersonActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslPersonExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DslpersonActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DslpersonActivator activator = DslpersonActivator.getInstance();
		return activator != null ? activator.getInjector(DslpersonActivator.ORG_PPGTI_DSLPERSON_DSLPERSON) : null;
	}

}