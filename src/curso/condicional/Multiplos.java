package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite Dois Números Inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		if ((n1 % n2 == 0) || (n2 % n1 == 0))
			System.out.println("São Múltiplos.");
		else
			System.out.print("Não São Múltiplos.");

		sc.close();
	}
}
