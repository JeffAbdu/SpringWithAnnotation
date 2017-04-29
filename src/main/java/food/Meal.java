package food;


//- Within the file appContext.xml add the following annotation: 
//    <context:annotation-config/>
//    -> with this class, we can set up annotations within our java classe [Meal.java] to do autowiring [to use the factory pattern to create objects for reference variables]:
//           -> By adding @Autowired on the top of the reference variables.
//           -> or by adding @Autowired on the top of the setters of the reference variables.


import org.springframework.beans.factory.annotation.Autowired;

public class Meal {
	
	//@Autowired   // This is autowiring by type: means if we define two fruit beans in the appContext.xml, we will have issue. 
	private Fruit fruit;
	//@Autowired
	private Dairy dairy;
	//@Autowired
	private Grain grain;
	//@Autowired
	private Meat meat;
	//@Autowired
	private Vegetable veg;
	
	
	public Fruit getFruit() {
		return fruit;
	}
	@Autowired
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	@Autowired
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	@Autowired
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	@Autowired
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVeg() {
		return veg;
	}
	//@Autowired
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
