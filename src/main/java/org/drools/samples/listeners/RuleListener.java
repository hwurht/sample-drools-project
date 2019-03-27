package org.drools.samples.listeners;

import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;

public class RuleListener extends DefaultAgendaEventListener {

	@Override
	public void afterMatchFired(AfterMatchFiredEvent event) {
		System.out.println("**********************");
		Rule rule = event.getMatch().getRule();
		System.out.println("Rule " + rule + " fired");
		System.out.println("Rule metadata = " + rule.getMetaData());
		System.out.println("**********************");
	}
}
