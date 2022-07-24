package ConjuntosOfObj;

import vehicles.Car;
import vehicles.Car2;
import vehicles.Car3;
import vehicles.Car4;
import vehicles.Car5;


public class DemoCar {

	public String runnigCar() {
		System.out.println("------------- Car -------------\n");
		Car car = new Car();
		car.airConditioner = "Cold and Hot";
		car.engine = "Gas";
		car.musicSystem = "MP4 Possitron";

		System.out.println("Engine: " + car.engine + "\n" + "Air_Conditioner: " + car.airConditioner + "\n" + "Song: "
				+ car.musicSystem + "\n");

		return "------------ Car ------------";
	}

	public String runnigCar2() {
		System.out.println("------------- Car2 -------------\n");
		Car2 car2 = new Car2();
		

		System.out.println("Air_Conditioner: " + car2.getAirConditioner());
		System.out.println("Engine: " + car2.getEngine());
		System.out.println("Entertainment System: " + car2.getEntertainmentSystem());
		System.out.println("Lights: " + car2.getLights());
		System.out.println("Wheel: " + car2.getWheel());
		System.out.println("Music System: " + car2.getMusicSystem());
		System.out.println("Steering: " + car2.getSteering() +"\n");
		
		return "---- Car2 -----";
	}

	public String runSuper() {
		Car3 car3 = new Car3("Eletric", "SongPlayMP9", "Hor or Cold", "Rim 21", "System GPS3", "Flex", 4, 5, 40, "LED");
		
		System.out.println("\nSteering: " + car3.getSteering());
		System.out.println("Music System: " + car3.getMusicSystem());
		System.out.println("Air_Conditioner: " + car3.getAirConditioner());
		System.out.println("Wheel: " + car3.getWheel());
		System.out.println("Entertainment System: " + car3.getEntertainmentSystem());
		
		System.out.println("Engine type: " + car3.getEngine());
		System.out.println("Number of seats: " + car3.getSeats());
		System.out.println("Feul tank capacity: " + car3.getFuelTank() + "Liters");
		System.out.println("Head lamp type: " + car3.getLights());
		System.out.println("Number of wheels: " + car3.getWheels() + "\n");

		
		return "---- Car3 with Super -----";
	}

	public String runToString() {
		Car4 car4 = new Car4("Eletric", "SongPlayMP9", "Hor or Cold", "Rim 21", "System GPS3", "Flex", 4, 5, 40, "LED");
		System.out.println(car4);

		return "---- Car with toString -----";
	}

	public String runToString2() {
		Car5 car5 = new Car5("Eletric", "SongPlayMP9", "Hor or Cold", "Rim 21", "System GPS3", "Flex", 4, 5, 40, "LED");
		car5.run5();

		return "---- Car with toString2 -----";
	}
}
