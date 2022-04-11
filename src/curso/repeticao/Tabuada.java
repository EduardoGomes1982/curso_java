package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Deseja a Tabuada para Qual Valor: ");
		n = sc.nextInt();

		for (int i = 1; i <= 10; i++)
			System.out.printf("%d x %d = %d%n", n, i, n * i);

		sc.close();
	}
}
