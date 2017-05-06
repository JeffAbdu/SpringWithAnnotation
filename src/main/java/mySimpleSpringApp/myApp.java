package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
        Meal myMeal = appContext.getBean("meal", Meal.class);
		        
        System.out.println("Fruit in meal assigned from SPEL: " + myMeal.getFruit().talkAboutYourself());

        System.out.println("Name of fruit directly set from SPEL " + myMeal.getFruitName());
        
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
