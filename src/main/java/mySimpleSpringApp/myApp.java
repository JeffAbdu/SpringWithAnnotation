package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.BigTire;
import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;
import car.SmallTire;
import food.Fruit;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
				
		SmallTire mySmallTire = appContext.getBean(SmallTire.class);
		System.out.println(mySmallTire.getTireDiameter());
		
		BigTire myBigTire = appContext.getBean(BigTire.class);
		System.out.println(myBigTire.getTireDiameter());
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
