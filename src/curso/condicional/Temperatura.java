package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double c, f;
		char t;

		System.out.print("Você vai Digitar a Temperatura em qual Escala (C/F)? ");
		t = sc.next().charAt(0);

		if ("F".equals(Character.toString(t).toUpperCase())) {
			System.out.print("Digite a Temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			c = 5.0 / 9.0 * (f - 32.0);
			System.out.printf("Temperatura Equivalente em Celsius: %.2f%n", c);
		} else if ("C".equals(Character.toString(t).toUpperCase())) {
			System.out.print("Digite a Temperatura em Celsius: ");
			c = sc.nextDouble();
			f = 9.0 / 5.0 * c + 32.0;
			System.out.printf("Temperatura Equivalente em Fahrenheit: %.2f%n", f);
		} else {
			System.out.println("Não é Possível Calcular.");
		}
		sc.close();
	}
}
