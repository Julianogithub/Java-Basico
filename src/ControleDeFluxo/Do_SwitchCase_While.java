package ControleDeFluxo;

import java.util.Scanner;

public class Do_SwitchCase_While {
	public String run() {
		do {
			Scanner saida = new Scanner(System.in);
			System.out.println(" \n-------------- Mes --------------\n");
			System.out.println(" \tDigite o número referente ao mês desejado:");
			System.out.println(" \tNumero 0 _ Para finalizar");
			System.out.println(" \tNumero 1 _ Mes de Jeneiro");
			System.out.println(" \tNumero 2 _ Mes de fevereiro");
			System.out.println(" \tNumero 3 _ Mes de Março");
			System.out.println(" \tNumero 4 _ Mes de Abril");
			System.out.println(" \tNumero 5 _ Mes de Maio");
			System.out.println(" \tNumero 6 _ Mes de Junho");
			System.out.println(" \tNumero 7 _ Mes de Julho");
			System.out.println(" \tNumero 8 _ Mes de Agosto");
			System.out.println(" \tNumero 9 _ Mes de Setembr");
			System.out.println(" \tNumero 10 _ Mes de Outubro");
			System.out.println(" \tNumero 11 _ Mes de Novembro:");
			System.out.println(" \tNumero 12 _ Mes de Dezenbro");
			System.out.println(" \tE outros numeros para continuar de 1 ate 12 :");

			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();

			switch (numero) {
			case 0:
				System.out.println("\tPrograma encerado!");
				System.exit(0);
				break;
			case 1:
				System.out.println("O mês é Janeiro!");
				break;
			case 2:
				System.out.println("O mês é Fevereiro!");
				break;
			case 3:
				System.out.println("O mês é Março!");
				break;
			case 4:
				System.out.println("O mês é Abril!");
				break;
			case 5:
				System.out.println("O mês é Maio!");
				break;
			case 6:
				System.out.println("O mês é Junho!");
				break;
			case 7:
				System.out.println("O mês é Julho!");
				break;
			case 8:
				System.out.println("O mês é Agosto!");
				break;
			case 9:
				System.out.println("O mês é Setembro!");
				break;
			case 10:
				System.out.println("O mês é Outubro!");
				break;
			case 11:
				System.out.println("O mês é Novembro!");
				break;
			case 12:
				System.out.println("O mês é Dezembro!");
				break;
			default:
				System.out.println("\tNumero não corespode, digite de 1 a 12");
				break;
			}
		} while (1 != 0);

	}
}