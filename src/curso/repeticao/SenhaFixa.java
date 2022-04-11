package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha, senhaVal;

		senhaVal = 2002;
		System.out.print("Digite a Senha: ");
		senha = sc.nextInt();
		
		while (senha != senhaVal) {
			System.out.print("Senha Inválida! Tente Novamente: ");

			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido!");
		sc.close();
	}
}
