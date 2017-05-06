package food;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Meal {
	
	@Value("#{myDemoFruit}")
	private Fruit fruit;
	
	@Value("#{myDemoFruit.name}")
	private String fruitName;
	
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}


	private Dairy dairy;
	private Grain grain;
	private Meat meat;
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
		 
		if(fruit != null) answer += "This meal has some fruit( " + fruit.getName() + ")\n"; 
		if(dairy != null) answer += "some dairy: ";
		if(grain	 != null) answer += "some grain: ";
		if(meat != null) answer += "some meat: ";
		if(veg != null) answer += "some vegetables: ";
		
		return answer;
	}

}
