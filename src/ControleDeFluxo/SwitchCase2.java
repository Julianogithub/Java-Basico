package ControleDeFluxo;

public class SwitchCase2 {
	public String run() {
		System.out.println("");
		char x = 'B';

		switch (x) {
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
			System.out.println("The value of x is other than a,b,c");
			break;

		}
		
		String name = "Julaino";

		switch (name) {
		case "Marcondes" : 
		case "marcondes" : 
			System.out.println("The last name is Marcondes");
			break;
		case "Julaino":
		case "julaino" :
			System.out.println("The name is Juliano");
			break;
		case "Rocha":
		case "rocha" :	
			System.out.println("The name is Rocha");
			break;
		default:
			System.out.println("The name is Juliano Marcondes Rocha");
			break;

		}
		return"---------Switch Case 2------------";
	}
}
