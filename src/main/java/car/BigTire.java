package car;

import Annotations.AnotherRandomDemoAnnotation;

//@Component
@AnotherRandomDemoAnnotation
public class BigTire implements Tire {

	private String tireDiameter = "22 inch diameter";
	
	public String getTireDiameter() {
		return tireDiameter;
	}
	
	public String roll(){
		return null;
	}
	
}
