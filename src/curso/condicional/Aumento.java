package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal, nSal, perc, dif;

		System.out.print("Digite o Salário da Pessoa: ");
		sal = sc.nextDouble();

		if (sal > 8000)
			perc = 0.05;
		else if (sal > 3000)
			perc = 0.1;
		else if (sal > 1000)
			perc = 0.15;
		else
			perc = 0.2;

		nSal = sal * (1 + perc);
		dif = nSal - sal;

		System.out.printf("Novo Salário = R$ %.2f%n", nSal);
		System.out.printf("Aumento = RS %.2f%n", dif);
		System.out.printf("Porcentagem = %.2f%%%n", perc * 100);
		sc.close();
	}
}
