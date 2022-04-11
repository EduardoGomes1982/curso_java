package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, media;

		System.out.print("Digite a Primeira Nota: ");
		n1 = sc.nextDouble();

		while ((n1 < 0) || (n1 > 10)) {
			System.out.print("Valor Inválido! Tente Novamente: ");
			n1 = sc.nextDouble();
		}

		System.out.print("Digite a Segunda Nota: ");
		n2 = sc.nextDouble();

		while ((n2 < 0) || (n2 > 10)) {
			System.out.print("Valor Inválido! Tente Novamente: ");
			n2 = sc.nextDouble();
		}

		media = (n1 + n2) / 2;
		System.out.printf("Média = %.1f%n", media);
		sc.close();
	}
}