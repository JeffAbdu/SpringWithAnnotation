package food;

import java.util.ArrayList;
import java.util.Random;

public class DataSource {
	
	public String appleDescription = "Hi, I am an apple description";
	
	public static String getAppleTypeStatic(){
		
	 ArrayList<String> types = new ArrayList<String>();
	 types.add("State Fair");
	 types.add("McIntosh");
	 types.add("Honeycrisp");
	 types.add("Regent");
	 types.add("Pinata");
	 types.add("Granny Smith");
	 
	 int index = new Random().nextInt(types.size());
     String type = types.get(index);
     return type;
	 
	}

	
	public static String getAppleType(){
		
		 ArrayList<String> types = new ArrayList<String>();
		 types.add("State Fair");
		 types.add("McIntosh");
		 types.add("Honeycrisp");
		 types.add("Regent");
		 types.add("Pinata");
		 types.add("Granny Smith");
		 
		 int index = new Random().nextInt(types.size());
	     String type = types.get(index);
	     return type;
		
	}
	
}
