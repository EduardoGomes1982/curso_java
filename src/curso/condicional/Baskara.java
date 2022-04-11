package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, r1, r2;

		System.out.print("Coeficiente A: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente B: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Esta Equação não Possui Raízes Reais.");
		} else {
			r1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
			r2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("X1 = %.4f%n", r1);
			System.out.printf("X2 = %.4f%n", r2);
		}
		
		sc.close();
	}
}
