package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, menor;

		System.out.print("Primeiro Valor: ");
		a = sc.nextInt();
		System.out.print("Segundo Valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro Valor: ");
		c = sc.nextInt();

		menor = a;

		if (b < menor)
			menor = b;

		if (c < menor)
			menor = c;

		System.out.printf("Menor = %d", menor);
		sc.close();
	}
}
