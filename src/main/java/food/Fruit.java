package food;

import javax.annotation.*;


public class Fruit {

	public Fruit(){}
	
	public String description="Not set";
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String talkAboutYourself(){
		return description;	
	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("The fruit bean is ready to go." + this.description);
	}
	
	@PreDestroy
	public void destroyMethod(){
		System.out.println("The fruit bean is about to be destroyed.");
	}
	
}
