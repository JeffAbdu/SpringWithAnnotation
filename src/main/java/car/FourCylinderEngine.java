package car;

import javax.inject.Named;

@Named("fourCyl")
public class FourCylinderEngine implements Engine {

	public int getNumberOfCylinders() {
		return 4;
	}

	public String drive() {
		return "Driving effeciently with 4 cylinders.";
	}

}
