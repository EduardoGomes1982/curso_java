package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double hh, h, vlTotal;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		hh = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		h = sc.nextDouble();
		
		vlTotal = h * hh;
		System.out.printf("O pagamento para %s deve ser %.2f", nome, vlTotal);
		sc.close();
	}
}
