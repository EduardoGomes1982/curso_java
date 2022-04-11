package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, p, soma;

		System.out.println("Digite Dois Números:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			p = y;
			y = x;
			x = p;
		}

		soma = 0;

		for (int i = x + 1; i < y; i++)
			if (i % 2 != 0)
				soma += i;

		System.out.printf("Soma dos Ímpares = %d", soma);
		sc.close();
	}
}
