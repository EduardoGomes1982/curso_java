package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, d, f;

		System.out.print("Quantos Números Você vai Digitar: ");
		x = sc.nextInt();
		d = 0;
		f = 0;

		for (int i = 1; i <= x; i++) {
			System.out.print("Digite um Número: ");
			y = sc.nextInt();

			if ((y >= 10) && (y <= 20))
				d += 1;
			else
				f += 1;
		}

		System.out.printf("%d dentro.%n", d);
		System.out.printf("%d fora.%n", f);
		sc.close();
	}
}
