package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Indicamos que este es nuestro controlador MCV
@Controller
public class Controlador {

	//Para indicar la vista que queremos ver
	@RequestMapping
	public String muestraPagina() {
		
		//Devuelve un archivo jsp almacenado en META-INF/vista
		return "paginaEjemplo";
	}
}
