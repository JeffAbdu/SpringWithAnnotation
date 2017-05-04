package car;

import Annotations.RandomDemoAnnotation;

//@Component
@RandomDemoAnnotation
public class SmallTire implements Tire {

	private String tireDiameter = "12 inch diamter";
	
	public String getTireDiameter() {
		return tireDiameter;
	}
	
	public String roll(){
		return null;
	}
	
	
}
