package laptop;

import laptop.components.GraphicsCard;
import laptop.components.Processor;

public class Laptop {

	private float screen;
	private Processor processor; 			//Chamando a classe Processor
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;		//Chamando a classe Graphics
	private String opticalDrive;
	private String keyboard;

	public Laptop() {

		this.screen = 15.6f;
		this.processor = new Processor(); 	//Estanciando a classe Processor
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();		//Estancianso a calsse GraphicsCard
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "\tLaptop \n screen = " + screen + ",\n processor = " + processor + ",\n ram = " 
				+ ram + ",\n hardDrive = " + hardDrive + ",\n graphicsCard = " 
				+ graphicsCard + ",\n opticalDrive = " + opticalDrive + ",\n keyboard = " 
				+ keyboard + "\n********* ToString Laptop ************\n";
	}
}
