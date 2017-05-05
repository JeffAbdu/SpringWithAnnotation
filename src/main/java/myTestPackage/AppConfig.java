package myTestPackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan({"car"})
public class AppConfig {

//	@Bean(name="fourCyl")
//	public FourCylinderEngine getFourCyl(){
//		return new FourCylinderEngine();
//	} 
//	 
//	@Bean(name="sixCyl")
//	public SixCylinderEngine getSixCyl(){
//		return new SixCylinderEngine();
//	}

	
	
	
}

