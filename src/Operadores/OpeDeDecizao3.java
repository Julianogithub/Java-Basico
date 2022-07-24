package Operadores;

public class OpeDeDecizao3 {
	public String run() {
		System.out.println("\n-------- int && >= --------");
		int ageOfBoy = 36;
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- int && <= --------");
		int ageOfBoy1 = 36;
		int ageOfGirl1 = 25;

		if ((ageOfBoy1 <= 21) && (ageOfGirl1 <= 18)) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- int || <= --------");
		int ageOfBoy2 = 36;
		int ageOfGirl2 = 25;

		if ((ageOfBoy2 <= 21) || (ageOfGirl2 <= 18)) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- int || >= --------");
		int ageOfBoy7 = 36;
		int ageOfGirl7 = 25;

		if ((ageOfBoy7 >= 21) || (ageOfGirl7 >= 18)) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- String && != --------");
		String ageOfBoy3 = "36";
		String ageOfGirl3 = "25";

		if ((ageOfBoy3 != "21") && (ageOfGirl3 != "18")) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- String || != --------");
		String ageOfBoy4 = "36";
		String ageOfGirl4 = "25";

		if ((ageOfBoy4 != "21") || (ageOfGirl4 != "18")) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- String && == --------");
		String ageOfBoy5 = "36";
		String ageOfGirl5 = "25";

		if ((ageOfBoy5 == "21") && (ageOfGirl5 == "18")) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		System.out.println("\n-------- String || == --------");
		String ageOfBoy6 = "36";
		String ageOfGirl6 = "25";

		if ((ageOfBoy6 == "21") || (ageOfGirl6 == "18")) {
			System.out.println("ready to get married!");
			System.out.println("pronto para casar!");

		} else {
			System.out.println("Wait for it kiddo!");
			System.out.println("Espere por isso garoto!");
		}
		
		return "-------------- Operador de decizao3 -----------------------";
	}

}
