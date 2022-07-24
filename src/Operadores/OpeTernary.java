package Operadores;

public class OpeTernary {
	public String run() {
		System.out.println("\n---- Operador Ternario com int ----\n");
		int x = 10, y = 16, w = 4 ;

		x = (10 == x) ? 1 : 0;

		System.out.println(x);
		
		y = (16 != y) ? 1 : 0;

		System.out.println(y);
		
		w = (16 >= w) ? 1 : 0;

		System.out.println(w);
		
		w = (16 <= w) ? 1 : 0;
		
		System.out.println(w);
		
		System.out.println("\n---- Operador Ternario com String ----\n");
		
		String neme = "juliano", sobreneme = "Rocha", nemeDoMeio = "Marcondes";
		
		neme = ("juliano" == neme) ? "juliano = true" : "juliano = false";

		System.out.println(neme);
		
		sobreneme = ("Rocha" != sobreneme) ? "Rocha = true" : "Rocha = false";

		System.out.println(sobreneme);
		
		nemeDoMeio  = ("Marcondes" != nemeDoMeio ) ? "Marcondes = true" : "Marcondes = false";

		System.out.println(nemeDoMeio );
		
		nemeDoMeio  = ("Marcondes" != neme ) ? "Marcondes = true" : "Marcondes = false";

		System.out.println(nemeDoMeio );
		
		return "-------------- Operador Ternario -----------------------";
	}

}
