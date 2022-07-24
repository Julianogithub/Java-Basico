package ConjuntosOfObj;

import laptop.Laptop;
import laptop.Laptop2;
import laptop.Laptop3;
import laptop.components.GraphicsCard3;
import laptop.components.Processor3;

public class DemoGraphics {
	
	public String runGraphics(){
		Laptop lappy = new Laptop();
		System.out.println(lappy);
		
		return "----- Dominando classes sem usar * get e set * ------";
	}
	
	public String runGraphics2(){
		Laptop2 lappy2 = new Laptop2();
		
		System.out.println(lappy2.getProcessor2().getBrand());
		System.out.println(lappy2.getProcessor2().getCores());
		System.out.println(lappy2.getProcessor2().getMaxfrequency());
		System.out.println(lappy2.getProcessor2().getCacheMemory());
		System.out.println(lappy2.getProcessor2().getGeneration());
			
		return "----- Dominando classes usar * get * ------";
	}

	
	public String runGraphics3(){
		System.out.println("********************************************");
		Processor3 processor3 = new Processor3("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard3 graphicsCard3 = new GraphicsCard3("Nvidia", 1050, "4GB");
		
		Laptop3 gamingLaptop3 = new Laptop3(17f, processor3,
				"DDR4", "2TB", graphicsCard3, null, "backlit");
		
		System.out.println("\n\t** Notebook para jogos **\n" + gamingLaptop3);
		gamingLaptop3.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println("Current frequency: "+gamingLaptop3.getProcessor3().getFrequency());
		System.out.println("Cache Memory: "+gamingLaptop3.getProcessor3().getCacheMemory());
		
		return "----- Dominando classes sem usar * get e set * ------";
	}
}
