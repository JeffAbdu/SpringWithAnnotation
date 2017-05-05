package car;



public class FamilyCar {

    private Tire frontLeft;
	
	private Tire frontRight;
	
	private Tire rearLeft;	

	private Tire rearRight;
	
	private Engine engineType;
    
	public Tire getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(Tire frontLeft) {
		this.frontLeft = frontLeft;
	}
	public Tire getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(Tire frontRight) {
		this.frontRight = frontRight;
	}
	public Tire getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(Tire rearLeft) {
		this.rearLeft = rearLeft;
	}
	public Tire getRearRight() {
		return rearRight;
	}
	public void setRearRight(Tire rearRight) {
		this.rearRight = rearRight;
	}
	public Engine getEngineType() {
		return engineType;
	}
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

    
	public String getCarDescription(){

		String description = "";
		if(frontLeft !=null){description += " Front left tire: " + frontLeft.getTireDiameter();}
		if(frontRight !=null){description += " Front right tire: " + frontRight.getTireDiameter();}
		if(rearLeft !=null){description += " Rear left tire: " + rearLeft.getTireDiameter();}
		if(rearRight !=null){description += " Rear right tire: " + rearRight.getTireDiameter();}
		if(engineType !=null){description += " Engine type: " + engineType.getNumberOfCylinders();}
		if(description == "") description = " not set";
		return description;
		
		} 
	
	
	
}
