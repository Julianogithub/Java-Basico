package Operadores;

public class OpeDeDecizao {

	public String run() {
		int x = 4;

		if (x != 5) {
			System.out.println("Value of x is not 5\n");

		} else {
			System.out.println("Value of x is 5\n");
		}

		int y = 5;

		if (y != 5) {
			System.out.println("Value of y is not 5\n");

		} else {
			System.out.println("Value of y is 5 \n");
		}

		String nome = "Juliano";

		if (nome != "Juliano") {
			System.out.println("The Neme is not Juliano \n");

		} else {
			System.out.println("The Neme is Juliano \n");
		}
		
		String nome2 = "Juliano";

		if (nome2 != "Juca") {
			System.out.println("The Neme is not Juliano \n");

		} else {
			System.out.println("The Neme is Juliano \n");
		}
		return "-------------- Operador de decisao -----------------------";
	}

}
