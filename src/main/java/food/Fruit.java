package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fruit")
public class Fruit {

	private String name;
	private int nutritionalRating;
		
	public String getName() {
		return name;
	}
 
	@Autowired 
	public void setName(@Value("#{demoDataSource.getAppleType()?.toUpperCase() + ' APPLE'}") String name) {
		this.name = name;
	}

	public int getNutritionalRating() {
		return nutritionalRating;
	}

	@Autowired
	public void setNutritionalRating(@Value("#{T(java.lang.Math).random() * 10}") int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
	}

	
	public Fruit(){}
	
	public String description="Not set";
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String talkAboutYourself(){
        String about = "Hi I am fruit. I come from plants or trees with seeds\n";
        if(this.name != null) about += "My name is " + name + "\n";
        if(this.nutritionalRating > 0) about += "My nutritional Rating is " + nutritionalRating; 
		return about;	
	}
	
	//@PostConstruct
	public void initMethod(){
		System.out.println("The fruit bean is ready to go." + this.description);
	}
	
	//@PreDestroy
	public void destroyMethod(){
		System.out.println("The fruit bean is about to be destroyed.");
	}
	
}
