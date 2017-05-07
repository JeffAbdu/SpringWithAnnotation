package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import script.ScriptLoaderDemoClass;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		ScriptLoaderDemoClass sl = appContext.getBean("sL", ScriptLoaderDemoClass.class);
		
		sl.loadScript();
			
		((FileSystemXmlApplicationContext)appContext).close();
		
	}

	
}
