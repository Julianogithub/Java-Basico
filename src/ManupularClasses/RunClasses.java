package ManupularClasses;

public class RunClasses {

	public String runCar1() {
		Car1 car1 = new Car1();
		car1.setSpeed(10);
		System.out.println("\n" + car1.getSpeed());

		return "-----Manipulação de Classes1----";
	}

	public String runCar2() {
		Car2 car2 = new Car2();
		car2.setDoors("closed");
		car2.setDriver("seated");
		car2.setEngine("on");
		car2.setSpeed(10);

		System.out.println("\n" + car2.getDoors() + "\n" + car2.getDriver() + "\n" + car2.getSpeed() + "\n"
				+ car2.getEngine() + "\n");
		System.out.println(car2.run());

		return "-----Manipulação de Classes2----";
	}

	public String runCar3() {
		Car3 car3 = new Car3("closed","on","seated",10);
		
		System.out.println("\n" + car3.getDoors() + "\n" + car3.getDriver() + "\n" + car3.getSpeed() + "\n"
				+ car3.getEngine() + "\n");
		
		System.out.println(car3.run());

		return "-----Manipulação de Classes3----";
	}

}