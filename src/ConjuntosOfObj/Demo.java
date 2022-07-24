package ConjuntosOfObj;

import vehicles.Bike;
import vehicles.Bike2;
import vehicles.Bike3;
import vehicles.Bike4;
import vehicles.Bike5;

public class Demo {

	public String runnig() {
		Bike bike = new Bike();
		bike.handle = "Short";
		bike.engine = "Petrol";

		System.out.println("Engine: " + bike.engine + "\n" + "Handle: " + bike.handle);

		return "---- Bike -----";
	}

	public String runnig2() {
		Bike2 bike = new Bike2();

		System.out.println("Handle: " + bike.getHandle());
		System.out.println("Engine: " + bike.getEngine());
		System.out.println("Lights: " + bike.getLights());
		

		return "---- Bike2 -----";
	}

	public String runSuper() {
		Bike3 bike3 = new Bike3("long", "Deisel", 4, 5, 40, "LED");
		
		System.out.println("\nHandle: " + bike3.getHandle());
		System.out.println("Engine type: " + bike3.getEngine());
		System.out.println("Number of seats: " + bike3.getSeats());
		System.out.println("Feul tank capacity: " + bike3.getFuelTank() + "Liters");
		System.out.println("Head lamp type: " + bike3.getLights());
		System.out.println("Number of wheels: " + bike3.getWheels());
		
		System.out.println("\nHandle: " + bike3.getHandle());
		System.out.println("Tipo de motor " + bike3.getEngine());
		System.out.println("Número de assentos: " + bike3.getSeats());
		System.out.println("Capacidade do tanque de combustível: " + bike3.getFuelTank() + " Litros");
		System.out.println("Tipo de lâmpada principal: " + bike3.getLights());
		System.out.println("Número de rodas: " + bike3.getWheels());

		return "---- Bike3 with Super -----";
	}

	public String runToString() {
		Bike4 bike4 = new Bike4("long", "Deisel",4, 5, 40, "LED");
        System.out.println(bike4);

		return "---- Bike with toString -----";
	}
	
	public String runToString2() {
		Bike5 bike5 = new Bike5("long", "Deisel",4, 5, 40, "LED");
		bike5.run5();

		return "---- Bike with toString2 -----";
	}
}
