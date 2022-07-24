package laptop;

import laptop.components.GraphicsCard3;
import laptop.components.Processor3;

public class Laptop3 {

	private float screen;
	private Processor3 processor3; 			//Chamando a classe Processor
	private String ram;
	private String hardDrive;
	private GraphicsCard3 graphicsCard3;		//Chamando a classe Graphics
	private String opticalDrive;
	private String keyboard;

	public Laptop3() {

		this.screen = 15.6f;
		this.processor3 = new Processor3(); 	//Estanciando a classe Processor
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard3 = new GraphicsCard3();		//Estancianso a calsse GraphicsCard
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}

	public Laptop3(float screen, Processor3 processor3, String ram, String hardDrive, GraphicsCard3 graphicsCard3,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor3 = processor3;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard3 = graphicsCard3;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "\tLaptop \n screen = " + screen + ",\n processor = " + processor3 + ",\n ram = " 
				+ ram + ",\n hardDrive = " + hardDrive + ",\n graphicsCard = " 
				+ graphicsCard3 + ",\n opticalDrive = " + opticalDrive + ",\n keyboard = " 
				+ keyboard + "\n********* ToString Laptop ************\n";
	}

	public float getScreen() {
		return screen;
	}

	public Processor3 getProcessor3() {
		return processor3;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicsCard3 getGraphicsCard3() {
		return graphicsCard3;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	 public String gamingMode(){
	    	processor3.setFrequency(processor3.getMaxfrequency());
	    	return "Success";
	    }
}
