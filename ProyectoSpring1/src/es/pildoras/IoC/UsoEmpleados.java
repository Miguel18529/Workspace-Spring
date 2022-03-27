package es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados{

	public static void main(String[] args) {
		
		/*
		//Creacion de objetos de tipo Empleado
		
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		
		System.out.println(Empleado1.getTareas());
		*/
		
		//Cargamos el xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Generamos un objeto desde el contexto
		
		//Para generar objetos de distinto tipo, solo hemos tenido que cambiar el xml
		//INVERSION OF CONTROL
		
		Empleados miguel = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(miguel.getTareas());
		
		contexto.close();
		
		
	}


}
