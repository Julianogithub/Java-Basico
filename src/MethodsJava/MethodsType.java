package MethodsJava;

public class MethodsType {
	public String run() {
		
		loop(1, 4);
		System.out.println("********************");
		loop(20, 24);
		System.out.println("********************");
		loop(10, 14);
		
		return"-------- Methods Type -------";
	}

	public static void loop(int step, int finalValue) {

		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}
	}
}
