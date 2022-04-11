package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, s;
		
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		s = Math.PI * Math.pow(r, 2);
		sc.close();
		
		System.out.printf("AREA = %.2f", s);
	}
}
