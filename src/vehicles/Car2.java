package vehicles;

import parent.Vehicle2;

public class Car2 extends Vehicle2 {

	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String wheel;
	private String entertainmentSystem;
	
	public Car2() {
		super();
		this.steering = "Hidraulica";
		this.musicSystem = "Playr MP4";
		this.airConditioner = "Cold or Hot";
		this.wheel = "Rim 17";
		this.entertainmentSystem = "System GPS";
	}
	public Car2(String steering, String musicSystem, String airConditioner, String wheel, String entertainmentSystem) {
		super();
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
	
}
