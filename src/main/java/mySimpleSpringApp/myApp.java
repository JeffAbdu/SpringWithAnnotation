package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import food.Fruit;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit fruitDescriptionRequired = appContext.getBean("fruit", Fruit.class);
		System.out.println("Spring meal: " + fruitDescriptionRequired.talkAboutYourself() );
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
