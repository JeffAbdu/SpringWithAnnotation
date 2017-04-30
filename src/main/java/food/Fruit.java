package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {

	public Fruit(){}
	
	public String description = "not set";
	
	public String getDescription(){
		return description;
	}
	
	@Autowired
	public void setDescription(@Value("Hi, I am fruit. My description was set using value annotation.") String description){
		this.description = description;
	}
	
	public String talkAboutYourself(){
		return description;
	}
	
}
