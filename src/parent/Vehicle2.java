package parent;

public class Vehicle2 {

	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	public Vehicle2() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";	
		
	}

	public Vehicle2(String engine, int wheels, int seats, int fuelTank, String lights) {

			this.engine = engine;
			this.wheels = wheels;
			this.seats = seats;
			this.fuelTank = fuelTank;
			this.lights = lights;
		}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

}
