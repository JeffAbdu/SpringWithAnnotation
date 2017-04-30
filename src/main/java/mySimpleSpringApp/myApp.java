package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import food.Fruit;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		FamilyCar myFamilyCar = appContext.getBean("altFamilyCar", FamilyCar.class);
		System.out.println("Spring meal: " + myFamilyCar.getCarDescription() );
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
