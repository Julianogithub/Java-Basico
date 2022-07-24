package ControleDeFluxo;

public class NestedLoopsExercise {
	public String run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print('@');
			}
			System.out.println();
		}
		return"--------- Nested Loops Exercise ------------ \n";
	}
}
