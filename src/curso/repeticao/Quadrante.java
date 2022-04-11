package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;
		String msg;

		System.out.println("Digite os Valores das Coordenadas X e Y:");
		x = sc.nextInt();
		y = sc.nextInt();

		while ((x != 0) && (y != 0)) {
			if ((x > 0) && (y > 0))
				msg = "Quadrante Q1";
			else if (y > 0)
				msg = "Quadrante Q2";
			else if (x > 0)
				msg = "Quadrante Q4";
			else
				msg = "Quadrante Q3";

			System.out.println(msg);
			System.out.print("Digite os Valores das Coordenadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}
}
