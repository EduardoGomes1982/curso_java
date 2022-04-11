package curso.condicional;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salAnual, servAnual, gCapAnual, gMed, gEdu, salMens, tImp, maxDedut, vDedut, vAbat, impSal, impServ,
				impGanhoCap, impDev;

		System.out.print("Renda Anual com Salário: ");
		salAnual = sc.nextDouble();

		System.out.print("Renda Anual com Prestação de Serviços: ");
		servAnual = sc.nextDouble();

		System.out.print("Renda Anual com Ganho de Capital: ");
		gCapAnual = sc.nextDouble();

		System.out.print("Gastos Médicos: ");
		gMed = sc.nextDouble();

		System.out.print("Gastos Educacionais: ");
		gEdu = sc.nextDouble();

		sc.close();

		salMens = salAnual / 12;

		if (salMens > 5000) {
			impSal = salAnual * 0.2;
		} else if (salMens > 3000) {
			impSal = salAnual * 0.1;
		} else {
			impSal = 0;
		}

		impServ = servAnual * 0.15;
		impGanhoCap = gCapAnual * 0.2;
		tImp = impSal + impServ + impGanhoCap;
		maxDedut = tImp * 0.3;
		vDedut = gEdu + gMed;
		vAbat = (vDedut > maxDedut) ? maxDedut : vDedut;
		impDev = tImp - vAbat;

		System.out.println();

		System.out.println("Relatório de Imposto de Renda");
		System.out.println();
		System.out.println("Consolidado de Renda:");
		System.out.printf("Imposto Sobre Salário: %.2f%n", impSal);
		System.out.printf("Imposto Sobre Serviços: %.2f%n", impServ);
		System.out.printf("Imposto Sobre Gando de Capital: %.2f%n", impGanhoCap);
		System.out.println();
		System.out.println("Deduções:");
		System.out.printf("Máximo Dedutível: %.2f%n", maxDedut);
		System.out.printf("Gastos Dedutíveis: %.2f%n", vDedut);
		System.out.println();
		System.out.println("Resumo:");
		System.out.printf("Imposto Bruto Total: %.2f%n", tImp);
		System.out.printf("Abatimento: %.2f%n", vAbat);
		System.out.printf("Imposto Devido: %.2f%n", impDev);
	}
}
