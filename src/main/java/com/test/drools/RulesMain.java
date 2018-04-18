package com.test.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesMain {
	public static void main(String[] args) {
		System.out.println("Hello rules");
		
		KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession();
        Person p = new Person();
        p.setName("test name");
        p.setAddress("sdfsdfdsfds sfsfdsfdsfdsf");
        kSession.insert(p);
        kSession.fireAllRules();
	}

}
