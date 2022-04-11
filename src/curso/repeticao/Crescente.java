package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite Dois Números:");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {
			if (x > y)
				System.out.println("Decrescente!");
			else
				System.out.println("Crescente!");

			System.out.println("Digite Outros Dois Números:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
