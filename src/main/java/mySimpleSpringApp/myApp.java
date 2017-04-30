package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Fruit;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		// fruit bean that sets the description within the xml file
		Fruit fruit = appContext.getBean("fruit", Fruit.class);
		System.out.println("Spring meal: " + fruit.talkAboutYourself() );
		
		// fruitToSetWithAnnotation bean that sets the description value using annotation
		Fruit fruitAnnotation = appContext.getBean("fruitToSetWithAnnotation", Fruit.class);
		System.out.println("Spring meal: " + fruitAnnotation.talkAboutYourself() );
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
