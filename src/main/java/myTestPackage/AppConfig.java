package myTestPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;

@Configuration
@ComponentScan({"car"})
public class AppConfig {

	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCyl(){
		return new FourCylinderEngine();
	} 
	 
	@Bean(name="sixCyl")
	public SixCylinderEngine getSixCyl(){
		return new SixCylinderEngine();
	}

	@Bean(name="familyCar")
	public FamilyCar getFamilyCar(){
		
		// Create instance with no properties being set
		// We want to autowire an engine type
		FamilyCar familyCar = new FamilyCar();
		
		//Return instance:
		return familyCar;
	}
	
	
	
}

