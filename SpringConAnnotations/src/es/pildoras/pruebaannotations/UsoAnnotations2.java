package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//Leer el xml de configuración
				//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Leer el class de configuración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedir un bean al contenedor
		/*
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		
		//Apuntan al mismo objeto en memoria?
		
		if(Antonio == Lucia) {
			System.out.println("Apntan al mismo luegar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" + Lucia);
		}
		
		System.out.println(Antonio.getInforme());
		*/
		
		//Pedir un bean al contenedor
	
		/*Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		*/
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: " + empleado.getEmail());
		System.out.println("Empresa: " + empleado.getNombreEmpresa());
		//Cerrar el contexto
		contexto.close();
		
		
	}

}
