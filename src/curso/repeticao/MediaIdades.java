package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, soma, contador;
		double media;

		System.out.println("Digite as Idades:");
		idade = sc.nextInt();
		soma = 0;
		contador = 0;

		if (idade < 0)
			System.out.println("Impossível Calcular!");
		else {
			while (idade >= 0) {
				contador += 1;
				soma += idade;
				idade = sc.nextInt();
			}

			media = soma / contador;
			System.out.printf("Média = %.1f%n", media);
		}
		
		sc.close();
	}
}
