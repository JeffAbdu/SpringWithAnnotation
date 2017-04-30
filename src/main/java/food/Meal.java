package food;


//- Within the file appContext.xml add the following annotation: 
//    <context:annotation-config/>
//    -> with this class, we can set up annotations within our java classe [Meal.java] to do autowiring [to use the factory pattern to create objects for reference variables]:
//           -> By adding @Autowired on the top of the reference variables.
//           -> or by adding @Autowired on the top of the setters of the reference variables.


import org.springframework.beans.factory.annotation.Autowired;

public class Meal {
	
	@Autowired(required=false)     // In case the is no bean of the type "Fruit" within config xml file, then Spring will ignore it and avoid error message.   
	private Fruit fruit;
	@Autowired
	private Dairy dairy;
	@Autowired
	private Grain grain;
	@Autowired
	private Meat meat;
	@Autowired
	private Vegetable veg;
		
	
	public Fruit getFruit() {
		return fruit;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVeg() {
		return veg;
	}
	
	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}


	public String whatsInThisMeal(){
		
		String answer = "This meal contains:";
		 
		if(fruit != null) answer += "some fruit: "; 
		if(dairy != null) answer += "some dairy: ";
		if(grain	 != null) answer += "some grain: ";
		if(meat != null) answer += "some meat: ";
		if(veg != null) answer += "some vegetables: ";
		
		return answer;
	}

}
