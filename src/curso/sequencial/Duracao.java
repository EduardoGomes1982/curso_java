package curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tSeg, h, m, s;

		System.out.print("Digite a duracao em segundos: ");
		tSeg = sc.nextInt();
		sc.close();
		
		h = tSeg / 3600;
		m = tSeg % 3600 / 60;
		s = tSeg % 3600 % 60;

		System.out.printf("Hora: %d:%d:%d", h, m, s);
	}
}
