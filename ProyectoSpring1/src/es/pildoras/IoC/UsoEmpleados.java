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
		
		DirectorEmpleado miguel = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(miguel.getTareas());
		
		System.out.println(miguel.getInforme());
		
		System.out.println(miguel.getEmail());
		
		System.out.println(miguel.getNombreEmpresa());
		
		/*SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " + Maria.getEmail());
		
		System.out.println(Maria.getNombreEmpresa());
		
		System.out.println("Email Pablo: " + Pablo.getEmail());\
		*/
		
		contexto.close();
		
		
	}


}
