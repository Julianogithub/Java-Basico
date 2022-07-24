package vehicles;

import parent.Vehicle2;

public class Bike2 extends Vehicle2 {

	private String handle;

	public Bike2() {
		super();
		this.handle = "short";
	}

	public Bike2(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}
