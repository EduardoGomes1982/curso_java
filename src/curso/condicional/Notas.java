package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, nFinal;
		
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		
		nFinal = n1 + n2;
		
		System.out.printf("NOTA FINAL = %.2f%n", nFinal);
		if (nFinal < 60) System.out.println("REPROVADO");
		
		sc.close();
	}
}
