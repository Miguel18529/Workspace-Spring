package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Con esta anotacion, Spring registra el Bean
//Si no pones los parentesis, usa el nombre de la clase con la primera letra en minus
@Component("ComercialExperimentado")
@Scope("prototype")
public class ComercialExperimentado implements Empleados{
	
	/*//ejecución de código después de creación del Bean
	//Reemplaza a init
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	//ejecución de código después de apagado contenedor Spring
	//Reemplaza a Destroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucción");
	}*/
	
	public ComercialExperimentado() {
		
	}
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
*/
	
	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender, y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

	
	
	@Autowired
	@Qualifier("informeFinancieroTrim3") //Beaan id que debe usar
	private CreacionInformeFinanciero nuevoInforme;
	

}
