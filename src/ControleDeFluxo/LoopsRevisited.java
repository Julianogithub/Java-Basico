package ControleDeFluxo;

public class LoopsRevisited {
	public String run() {

		System.out.println("");
		for (int i = 1, j = 1; i < 10 || j < 10; i++, j++) {
			j++;
			System.out.println("i=" + i + " and j=" + j);
		}

		System.out.println("");
		int i = 1, j = 10;

		while (i < 10 || j < 10) {
			i++;
			j++;
			System.out.println("i=" + i + " and j=" + j);
		}

		System.out.println("");
		int a = 1, b = 10;

		do {
			a++;
			b++;
			System.out.println("i=" + a + " and j=" + b);
		} while (a < 10 || b < 10);

		return "--------- Loop Revisited ------------";
	}
}
