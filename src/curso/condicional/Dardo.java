package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, maior;

		System.out.println("Digite as Três Distâncias:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		maior = a;

		if (b > maior)
			maior = b;

		if (c > maior)
			maior = c;

		System.out.printf("Maior Distância = %.2f", maior);
		sc.close();
	}
}
