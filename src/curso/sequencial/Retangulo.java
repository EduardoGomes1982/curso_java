package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area, perimetro, diagonal, base, altura;

		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		sc.close();

		area = base * altura;
		perimetro = base * 2 + altura * 2;
		diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
	}
}
