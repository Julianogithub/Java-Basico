package Operadores;

public class OpeIfElse {
	public String run() {
		int x = 5;

		if (x == 5) {
			if (x >= 5) {
				System.out.println("X is greater than 5");
				System.out.println("X é maior que 5");
			} else {
				System.out.println("X is smaller than 5");
				System.out.println("X é menor que 5");
			}
		}
		
		if (x == 5) {
			if (x != 5) {
				System.out.println("X is different than 5");
				System.out.println("X é diferente que 5");
			} else {
				System.out.println("X is equal than 5");
				System.out.println("X é egual que 5");
			}
		}
		
		int y = 3;
		
		if (y == 3) {
			System.out.println("Y equals to 3");
			System.out.println("X é maior que 3");
		} else if (y > 5) {
			System.out.println("Y is greater to 3");
			System.out.println("Y é maior que 3");
		} else {
			System.out.println("Y is smaller than 3");
			System.out.println("X é menor que 3");
		}

		return "-------------- Operador If Else -----------------------";
	}
}