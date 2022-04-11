package curso.classes.application;

import java.util.Locale;
import java.util.Scanner;

import curso.classes.application.util.CurrencyConverter;

public class CurrencyProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, amount;
		
		System.out.print("Qual o valor do dólar? ");
		dollarPrice = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		amount = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais = %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, amount));
		sc.close();
	}
}