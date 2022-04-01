package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Con esta anotacion, Spring registra el Bean
//Si no pones los parentesis, usa el nombre de la clase con la primera letra en minus
@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados{
	
	private CreacionInformeFinanciero nuevoInforme;
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

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
	
	
	

}
