package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, n, d;

		System.out.print("Quantos Casos Você vai Digitar? ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print("Entre com o Numerador: ");
			n = sc.nextInt();
			System.out.print("Entre com o Denominador: ");
			d = sc.nextInt();

			if (d == 0)
				System.out.println("Divisão Impossível!");
			else
				System.out.printf("Divisão = %.1f%n", (double)n / d);
		}
		
		sc.close();
	}
}
