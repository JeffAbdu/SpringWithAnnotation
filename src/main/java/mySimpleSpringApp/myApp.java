package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import car.FourCylinderEngine;
import car.SixCylinderEngine;

import myTestPackage.AppConfig;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FourCylinderEngine fourCylinderEngine = appContext.getBean(FourCylinderEngine.class);
		System.out.println("myFour: " + fourCylinderEngine.getNumberOfCylinders());
		
		SixCylinderEngine sixCylinderEngine = appContext.getBean(SixCylinderEngine.class);
		System.out.println("MySix: " + sixCylinderEngine.getNumberOfCylinders());
		
		((AnnotationConfigApplicationContext)appContext).close();
		
	}

	
}
