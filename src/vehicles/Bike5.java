package vehicles;

import parent.Vehicle2;

public class Bike5 extends Vehicle2 {

	private String handle;

	public Bike5() {
		super();
		this.handle = "short";
	}

	public Bike5(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
	@Override
	public String toString() {
		return "\tBike5 com a função * get * \n Handle() = " + getHandle() + ",\n Engine() = " 
				+ getEngine() + ",\n Wheels() = " + getWheels() + ",\n Seats() = "
				+ getSeats() + ",\n FuelTank() = " + getFuelTank() + ",\n Lights() = " + getLights()
				+ "\n";
	}
	
	public void run5() {
		System.out.println("\tRunning bike5");
		System.out.println(toString());
	}

}
