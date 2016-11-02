package com.tareas;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class TareaMaquinaAmarillaBean implements TareaMaquinaAmarilla {

	@PostConstruct
	private void startup() { 
		System.out.println("Colombia GPS... ");

		TareaCargueMaquinariaAmarilla ct = new TareaCargueMaquinariaAmarilla();
		ct.ejecutarCargue();
		
		
        System.out.println("Fin Colombia GPS... ");
	}

	@PreDestroy
	private void shutdown() { 
		System.out.println("shutdown ... ");
	}
	
	
}
