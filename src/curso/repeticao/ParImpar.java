package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;

		System.out.print("Quantos Números Você vai Digitar: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print("Digite um Número: ");
			y = sc.nextInt();

			if (y == 0)
				System.out.println("Nulo.");
			else if (y > 0)
				if (y % 2 == 0)
					System.out.println("Par Positivo.");
				else
					System.out.println("Ímpar Positivo.");
			else if (y % 2 == 0)
				System.out.println("Par Negativo.");
			else
				System.out.println("Ímpar Negativo.");
		}
		
		sc.close();
	}
}
