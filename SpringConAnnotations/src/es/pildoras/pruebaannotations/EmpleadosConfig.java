package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Para prescindir del xml, usamos esta etiqueta para que esta clase sea el archivo de configuración
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
//Para tomar valores del archivo externo
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	// definir el Bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //id del Bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	
	//definir el Bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
