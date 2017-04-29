package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Meal myAnnotatedSpringMeal = appContext.getBean("mealByAnnotation", Meal.class);
		System.out.println("Spring meal: " + myAnnotatedSpringMeal.whatsInThisMeal() );
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
