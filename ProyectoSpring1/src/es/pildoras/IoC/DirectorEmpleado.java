package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//Creaci�n de campo tipo Creaci�nInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//Creaci�n de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	//Crear metodo init. Ejecutar tareas antes de que el Bean este disponible
	//Normalmente es void, pero no siempre
	public void metodoInicial() {
		//Todas las tareas a ejecutar antes de tener disponible el Bean DirectorEmpleado
		
		System.out.println("Dentro del m�todo init aqu� ir�an las tareas a ejecutar " + 
							" antes de que el Bean est� listo");
	}
	
	//Metodo destroy. Ejecutar tareas despues de que el Bean sea utilizado
	public void metodoFinal() {
		//Todas las tareas a ejecutar despues de la muerte del Bean DirectorEmpleado
		
		System.out.println("Dentro del m�todo destroy aqu� ir�an las tareas a ejecutar " + 
							" despu�s de que el Bean muera");
	}

}
