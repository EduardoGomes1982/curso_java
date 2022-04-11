package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pu, vr, troco;
		int qt;

		System.out.print("Preço Unitário do Produto: ");
		pu = sc.nextDouble();
		System.out.print("Quantidade Comprada: ");
		qt = sc.nextInt();
		System.out.print("Dinheiro Recebido: ");
		vr = sc.nextDouble();

		troco = vr - pu * qt;

		if (troco >= 0)
			System.out.printf("Troco = %.2f%n", troco);
		else
			System.out.printf("Dinheiro Insuficiente. Faltam %.2f Reais.%n", Math.abs(troco));

		sc.close();
	}
}
