package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;
import food.Fruit;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		
		FourCylinderEngine myFour = appContext.getBean("fourCyl", FourCylinderEngine.class);
		System.out.println("myFour: " + myFour.getNumberOfCylinders());
		
		SixCylinderEngine mySix = appContext.getBean("sixCyl", SixCylinderEngine.class);
		System.out.println("mySix: " + mySix.getNumberOfCylinders());
		
		FamilyCar familyCar = appContext.getBean("familyCar", FamilyCar.class);
		System.out.println("Family car: " + familyCar.getCarDescription() );
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
