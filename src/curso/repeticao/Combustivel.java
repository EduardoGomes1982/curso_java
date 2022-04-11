package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alc, gas, die, cod;
		boolean teste;

		teste = true;
		alc = 0;
		gas = 0;
		die = 0;

		while (teste) {
			System.out.print("Informe um Código (1, 2, 3) ou 4 para Parar: ");
			cod = sc.nextInt();

			switch (cod) {
			case 1:
				alc += 1;
				break;
			case 2:
				gas += 1;
				break;
			case 3:
				die += 1;
				break;
			case 4:
				teste = false;
				break;
			}
		}

		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", alc);
		System.out.printf("Gasolina: %d%n", gas);
		System.out.printf("Diesel: %d%n", die);
		sc.close();
	}
}
