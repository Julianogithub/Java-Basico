package vehicles;

import parent.Vehicle2;

public class Car5 extends Vehicle2{

	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String wheel;
	public String entertainmentSystem;
	
	public Car5() {
		super();
		this.steering = "Hidraulica";
		this.musicSystem = "Playr MP4";
		this.airConditioner = "Cold or Hot";
		this.wheel = "Rim 17";
		this.entertainmentSystem = "System GPS";
	}
	
	public Car5( String steering, String musicSystem, String airConditioner, String wheel, String entertainmentSystem,
			String engine, int wheels, int seats, int fuelTank, String lights) {
		
		super(engine,wheels,seats,fuelTank,lights);
		
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.wheel = wheel;
		this.entertainmentSystem = entertainmentSystem;
		
	}


	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getWheel() {
		return wheel;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	@Override
	public String toString() {
		return "\tCar5 com a função * get and toString * \n Steering() = " + getSteering() + ",\n MusicSystem() = " 
				+ getMusicSystem() + ",\n AirConditioner() = "	+ getAirConditioner() + ",\n Wheel() = " 
				+ getWheel() + ",\n EntertainmentSystem() = " + getEntertainmentSystem() + ",\n Engine() = " 
				+ getEngine() + ",\n Wheels() = " + getWheels() + ",\n Seats() = " + getSeats() + ",\n FuelTank() = " 
				+ getFuelTank() + ",\n Lights() = " + getLights() +  "\n";
	}
	
	public void run5() {
		System.out.println("\tRunning car5");
		System.out.println(toString());
	}
		
}
