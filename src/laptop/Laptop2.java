package laptop;

import laptop.components.GraphicsCard2;
import laptop.components.Processor2;

public class Laptop2 {

	private float screen;
	private Processor2 processor2; 			//Chamando a classe Processor
	private String ram;
	private String hardDrive;
	private GraphicsCard2 graphicsCard2;		//Chamando a classe Graphics
	private String opticalDrive;
	private String keyboard;

	public Laptop2() {

		this.screen = 15.6f;
		this.processor2 = new Processor2(); 	//Estanciando a classe Processor
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard2 = new GraphicsCard2();		//Estancianso a calsse GraphicsCard
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}

	public Laptop2(float screen, Processor2 processor2, String ram, String hardDrive, GraphicsCard2 graphicsCard2,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor2 = processor2;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard2 = graphicsCard2;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "\tLaptop \n screen = " + screen + ",\n processor = " + processor2 + ",\n ram = " 
				+ ram + ",\n hardDrive = " + hardDrive + ",\n graphicsCard = " 
				+ graphicsCard2 + ",\n opticalDrive = " + opticalDrive + ",\n keyboard = " 
				+ keyboard + "\n********* ToString Laptop ************\n";
	}

	public float getScreen() {
		return screen;
	}

	public Processor2 getProcessor2() {
		return processor2;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicsCard2 getGraphicsCard2() {
		return graphicsCard2;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	
}
