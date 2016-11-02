package com.tareas;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.facade.FacadeServiciosPolicia;



public class JobCargueMaquinaAmarilla implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		
		FacadeServiciosPolicia.getInstance().autenticarPolicia();
		
		System.out.println("prueba: "+new Date());
	}

}
