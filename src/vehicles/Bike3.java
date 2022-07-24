package vehicles;

import parent.Vehicle2;

public class Bike3 extends Vehicle2 {

	private String handle;

	public Bike3() {
		super();
		this.handle = "short";
	}

	public Bike3(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}
