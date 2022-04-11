package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, f;

		System.out.print("Digite o Valor de N [0,15]: ");
		x = sc.nextInt();
		f = 1;

		if ((x < 0) || (x > 15))
			System.out.println("Valor Fora da Margem Tolerada!");
		else {
			for (int i = 1; i <= x; i++)
				f = f * i;

			System.out.printf("Fatorial = %d", f);
		}
		
		sc.close();
	}
}
