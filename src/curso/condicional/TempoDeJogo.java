package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hIni, hFim, dur;

		System.out.print("Hora Inicial: ");
		hIni = sc.nextInt();
		System.out.print("Hora Final : ");
		hFim = sc.nextInt();

		if (hIni >= hFim) {
			hIni = hIni - 12;
			hFim = hFim + 12;
		}

		dur = hFim - hIni;

		System.out.printf("O Jogo Durou %d hora(s).", dur);
		sc.close();
	}
}
