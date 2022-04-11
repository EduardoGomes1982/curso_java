package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		double y1, y2, y3, media;

		System.out.print("Quantos Casos Você vai Digitar? ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println("Digite Três Números:");
			y1 = sc.nextDouble();
			y2 = sc.nextDouble();
			y3 = sc.nextDouble();
			media = (y1 * 2 + y2 * 3 + y3 * 5) / 10;
			System.out.printf("Média = %.1f%n", media);
		}

		sc.close();
	}
}
