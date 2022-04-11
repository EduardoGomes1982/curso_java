package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double vlUnit, qtComprada, vlRec, troco;

		System.out.print("Preço unitário do produto: ");
		vlUnit = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtComprada = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		vlRec = sc.nextDouble();
		troco = vlRec - vlUnit * qtComprada;
		sc.close();

		System.out.printf("TROCO = %.2f", troco);
	}
}
