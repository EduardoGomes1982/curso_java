package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, q, qt, r, s, c;
		char tCob;

		System.out.print("Quantos Casos de Teste serão Digitados? ");
		x = sc.nextInt();
		c = 0;
		r = 0;
		s = 0;

		for (int i = 1; i <= x; i++) {
			System.out.print("Quantidade de Cobaias: ");
			q = sc.nextInt();
			System.out.print("Tipo de Cobaia: ");
			sc.nextLine();
			tCob = sc.next().charAt(0);

			switch (Character.toString(tCob).toUpperCase()) {
			case "C":
				c += q;
				break;
			case "S":
				s += q;
				break;
			case "R":
				r += q;
				break;
			}
		}

		qt = c + r + s;
		System.out.println("Relatório Final:");
		System.out.printf("Total: %d cobaias.%n", qt);
		System.out.printf("Total de Coelhos: %d%n", c);
		System.out.printf("Total de Ratos: %d%n", r);
		System.out.printf("Total de Sapos: %d%n", s);
		System.out.printf("Percentual de Coelhos: %.2f%n", (double)c / qt * 100);
		System.out.printf("Percentual de Ratos: %.2f%n", (double) r / qt * 100);
		System.out.printf("Percentual de Sapos: %.2f%n", (double) s / qt * 100);
		sc.close();
	}
}
