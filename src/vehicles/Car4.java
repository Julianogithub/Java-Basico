package vehicles;

import parent.Vehicle2;

public class Car4 extends Vehicle2{

	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String wheel;
	public String entertainmentSystem;
	
	public Car4() {
		super();
		this.steering = "Hidraulica";
		this.musicSystem = "Playr MP4";
		this.airConditioner = "Cold or Hot";
		this.wheel = "Rim 17";
		this.entertainmentSystem = "System GPS";
	}
	
	public Car4( String steering, String musicSystem, String airConditioner, String wheel, String entertainmentSystem,
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
		return "\tCar4 com a função * get * \n getSteering() = " + getSteering() + ",\n getMusicSystem() = " 
				+ getMusicSystem() + ",\n getAirConditioner() = "	+ getAirConditioner() + ",\n getWheel() = " 
				+ getWheel() + ",\n getEntertainmentSystem() = " + getEntertainmentSystem() + ",\n getEngine() = " 
				+ getEngine() + ",\n getWheels() = " + getWheels() + ",\n getSeats() = " + getSeats() + ",\n getFuelTank() = " 
				+ getFuelTank() + ",\n getLights() = " + getLights() +  "\n";
	}
		
}
