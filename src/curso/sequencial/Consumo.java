package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double dist, combGasto, consMedio;
		
		System.out.print("Distancia percorrida: ");
		dist = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		combGasto = sc.nextDouble();
		sc.close();
		
		consMedio = dist / combGasto;
		
		System.out.printf("Consumo medio KM/L = %.2f", consMedio);
	}
}
