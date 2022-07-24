package laptop.phone;

public class Phone2 {
	private String model;

	public Phone2(String model) {
		this.model = model;
	}
    
	public void features(){
		System.out.println("Feature phone");
	}

	public String getModel() {
		return model;
	}
}
