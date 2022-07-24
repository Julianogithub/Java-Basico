package Operadores;

public class OpeDeDecizao2 {
	public String run() {

		int x = 6, y = 7;

		if (x >= y) {
			System.out.println("x1 = 6, y1 = 7 ||| (x1 <= y1) true");
		} else {
			System.out.println("x1 = 6, y1 = 7 ||| (x1 <= y1) false");
		}

		int x1 = 6, y1 = 7;

		if (x1 <= y1) {
			System.out.println("x1 = 6, y1 = 7 ||| (x1 <= y1) true");
		} else {
			System.out.println("x1 = 6, y1 = 7 ||| (x1 <= y1) false");
		}
		
		String nome = "Juliano", sobreNome = "Rocha";

		if (nome != sobreNome) {
			System.out.println("Neme is diferente de sobreneme true");
			System.out.println("Juliano != Rocha");
		} else {
			System.out.println("Neme is igual o sobreneme false");
			System.out.println("Juliano != Rocha");
		}
		
		String nome1 = "Juliano", sobreNome1 = "Rocha";

		if (nome1 == sobreNome1) {
			System.out.println("Neme is diferente de sobreneme: true");
			System.out.println("Juliano == Rocha");
		} else {
			System.out.println("Neme is igual o sobreneme false");
			System.out.println("Juliano == Rocha");
		}
		
		return "-------------- Operador de decizao2 -----------------------";
	}
}
