package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, soma;

		System.out.print("Digite um Número Inteiro: ");
		x = sc.nextInt();

		while (x != 0) {
			if (x % 2 != 0)
				x += 1;

			soma = 5 * x + 20;
			System.out.printf("Soma = %d%n", soma);
			System.out.print("Digite um Número Inteiro: ");
			x = sc.nextInt();
		}
		
		sc.close();
	}
}
