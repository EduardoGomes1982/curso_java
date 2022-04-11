package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		String msg;

		System.out.print("Valor de X: ");
		x = sc.nextDouble();
		System.out.print("Valor de Y: ");
		y = sc.nextDouble();

		if ((x == 0) && (y == 0))
			msg = "Origem";
		else if (x == 0)
			msg = "Eixo Y";
		else if (y == 0)
			msg = "Eixo X";
		else if ((x > 0) && (y > 0))
			msg = "Q1";
		else if (y > 0)
			msg = "Q2";
		else if (x > 0)
			msg = "Q4";
		else
			msg = "Q3";

		System.out.println(msg);
		sc.close();
	}
}
