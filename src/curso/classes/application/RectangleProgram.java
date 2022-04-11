package curso.classes.application;

import java.util.Locale;
import java.util.Scanner;

import curso.classes.application.entities.Rectangle;

public class RectangleProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura do retângulo:");
		Rectangle rectangle = new Rectangle();
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETRO = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		sc.close();
	}
}