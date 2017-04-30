package food;

import org.springframework.beans.factory.annotation.Required;


public class Fruit {

	public Fruit(){}
	
	public String description;
	
	public String getDescription(){
		return description;
	}
	
	@Required
	public void setDescription(String description){
		this.description = description;
	}
	
	public String talkAboutYourself(){
		return description;
	}
	
}
