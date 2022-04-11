package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, sQ, sT1, sT2;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();
		sc.close();
		
		sQ = a * b;
		sT1 = sQ / 2;
		sT2 = (a + b) / 2 * c;
		
		System.out.printf("AREA DO QUADRADO = %.3f%n", sQ);
		System.out.printf("AREA DO TRIANGULO = %.3f%n", sT1);
		System.out.printf("AREA DO TRAPEZIO = %.3f%n", sT2);
	}
}
