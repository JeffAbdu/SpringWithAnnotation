package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;
import food.Fruit;
import myTestPackage.AppConfig;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
        Fruit myFruit = appContext.getBean("fruit", Fruit.class);
        
        System.out.println(myFruit.talkAboutYourself());

		//((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
