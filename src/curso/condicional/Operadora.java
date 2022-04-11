package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int mUsado, valor, valorExc, franquia;

		System.out.print("Digite a Quantidade de Minutos: ");
		mUsado = sc.nextInt();
		valor = 50;
		franquia = 100;

		if (mUsado > franquia) {
			valorExc = (mUsado - franquia) * 2;
			valor = valor + valorExc;
		}

		System.out.printf("Valor a Pagar: R$ %d", valor);
		sc.close();
	}
}
