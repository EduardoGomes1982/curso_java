package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, preco, largura, altura, vlMetro;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		altura = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		vlMetro = sc.nextDouble();
		sc.close();
		
		area = largura * altura;
		preco = vlMetro  * area;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preco do terreno = %.2f%n", preco);
	}
}
