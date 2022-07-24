package ControleDeFluxo;

public class SwitchCase1 {
	public String run() {

		int x = 1, y = 3;
		String nameDoMeio = "Marcondes";

		if (x == 1) {
			System.out.println("The value of x is 1");
		} else if (x == 2) {
			System.out.println("The value of x is 2");
		} else if (x == 3) {
			System.out.println("The value of x is 3");
		} else {
			System.out.println("The value of x is other than 1,2,3");
		}
		
		System.out.println("* Juliano Marcondes Rocha *\n");
		if (nameDoMeio == "Marcondes") {
			System.out.println("The last name is Marcondes");
		} else if (nameDoMeio == "Juliano") {
			System.out.println("The last name is Juliano");
		} else if (nameDoMeio == "Rocha") {
			System.out.println("The last name is Rocha");
		} else {
			System.out.println("The last name is Juliano Marcondes Rocha");
		}

		switch (y) {
		case 1:
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
			System.out.println("The value of x is other than 1,2,3");
			break;

		}

		return "--------- Switch Case 1 ------------";
	}
}
