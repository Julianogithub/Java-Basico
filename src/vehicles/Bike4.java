package vehicles;

import parent.Vehicle2;

public class Bike4 extends Vehicle2 {

	private String handle;

	public Bike4() {
		super();
		this.handle = "short";
	}

	public Bike4(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
	@Override
	public String toString() {
		return "\tBike4 com a função * get * \n getHandle() = " + getHandle() + ",\n getEngine() = " 
				+ getEngine() + ",\n getWheels() = " + getWheels() + ",\n getSeats() = "
				+ getSeats() + ",\n getFuelTank() = " + getFuelTank() + ",\n getLights() = " + getLights()
				+ "\n";
	}

}
