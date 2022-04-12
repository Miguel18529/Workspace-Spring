package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//Leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Pedir un bean al contenedor
		
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
		
		//Cerrar el contexto
		contexto.close();
		
		
	}

}
