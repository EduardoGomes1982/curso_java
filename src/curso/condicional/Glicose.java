package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double g;
		String status;

		System.out.print("Digite a Medida da Glicose: ");
		g = sc.nextDouble();

		if (g > 140)
			status = "Diabetes";
		else if (g > 100)
			status = "Elevado";
		else
			status = "Normal";

		System.out.printf("Classificação: %s%n", status);
		sc.close();
	}
}
