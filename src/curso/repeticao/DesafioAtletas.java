package curso.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, tHom;
		String nome, atleMaisAlto;
		char sexo;
		double altura, mAlt, sAltMul, peso, sPeso;
		boolean cond;

		System.out.print("Qual a Quantidade de Atletas? ");
		x = sc.nextInt();
		sPeso = 0;
		tHom = 0;
		sAltMul = 0;
		mAlt = 0;
		atleMaisAlto = "";

		for (int i = 1; i <= x; i++) {
			System.out.printf("Digite os Dados do Atleta Número %d:%n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			cond = true;
			System.out.print("Sexo (F/M): ");
			sexo = sc.next().charAt(0);

			while (cond) {
				sexo = Character.toUpperCase(sexo);
				if ((sexo == 'F') || (sexo == 'M')) {
					cond = false;
				} else {
					System.out.print("Valor Inválido! Favor digitar F ou M: ");
					sexo = sc.next().charAt(0);
				}
			}

			if (sexo == 'M')
				tHom = tHom + 1;

			cond = true;
			System.out.print("Altura: ");
			altura = sc.nextDouble();

			while (cond) {
				if (altura > 0) {
					cond = false;
				} else {
					System.out.print("Valor Inválido! Favor Digitar um Valor Positivo: ");
					altura = sc.nextDouble();
				}
			}

			if (mAlt < altura) {
				mAlt = altura;
				atleMaisAlto = nome;
			}

			if (sexo == 'F')
				sAltMul = sAltMul + altura;

			cond = true;
			System.out.print("Peso: ");
			peso = sc.nextDouble();

			while (cond) {
				if (peso > 0) {
					cond = false;
				} else {
					System.out.print("Valor Inválido! Favor Digitar um Valor Positivo: ");
					peso = sc.nextDouble();
				}
			}

			sPeso = sPeso + peso;
		}

		sc.close();

		if (x > 0) {
			System.out.println();
			System.out.println("Relatório:");
			System.out.printf("Peso Médio dos Atletas: %.2f%n", (double) (sPeso / x));
			System.out.printf("Atleta mais Alto: %s%n", atleMaisAlto);
			System.out.printf("Porcentagem de Homens: %.2f%%%n", (double) (tHom / x * 100));
		}

		if (sAltMul > 0) {
			System.out.printf("Altura Médias das Mulheres: %.2f%n", (double) (sAltMul / (x - tHom)));
		} else {
			System.out.print("Não há Mulheres Cadastradas");
		}
	}
}