package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double v, vf;
		int qt, cod;

		System.out.print("Código do Produto Comprado: ");
		cod = sc.nextInt();
		System.out.print("Quantidade Comprada: ");
		qt = sc.nextInt();

		switch (cod) {
		case 1:
			v = 5.0;
			break;
		case 2:
			v = 3.5;
			break;
		case 3:
			v = 4.8;
			break;
		case 4:
			v = 8.9;
			break;
		case 5:
			v = 7.32;
			break;
		default:
			v = 0.0;
		}

		vf = v * qt;

		System.out.printf("Valor a Pagar: %.2f", vf);
		sc.close();
	}
}
