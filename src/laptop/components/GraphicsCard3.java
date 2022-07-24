package laptop.components;

public class GraphicsCard3 {
	private String brand;
	private int series;
	private String memory;

	public GraphicsCard3() {
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}

	public GraphicsCard3(String brand, int series, String memory) {

		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "\n\n Graphics Card \n brand = " + brand + ",\n series = " 
				+ series + ",\n memory = " + memory + "\n********* ToString Graphics Card ************\n";
	}
	
}
