package MethodsJava;

public class MethodsExercise {
	public String run() {
		boolean isPrime = isPrime(7);
		if (isPrime == true) {
			System.out.println("The input is a prime number");
		} else {
			System.out.println("The input is not a prime number");
		}
		return "----------- Methods Exercise ----------";
	}

	public static boolean isPrime(int number) {

		boolean isPrime = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
