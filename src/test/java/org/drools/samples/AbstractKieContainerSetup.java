package org.drools.samples;

import org.drools.samples.listeners.RuleListener;
import org.junit.After;
import org.junit.Before;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public abstract class AbstractKieContainerSetup {
	private KieContainer kc;
	protected StatelessKieSession kieSession;

	@Before
	public void setup () {
		kc = KieServices.Factory.get().getKieClasspathContainer();
		kieSession = kc.newStatelessKieSession();
		kieSession.addEventListener(new RuleListener());
	}
	
	@After
	public void teardown () {
		if (kc != null) {
			kc.dispose();
		}
	}
}
