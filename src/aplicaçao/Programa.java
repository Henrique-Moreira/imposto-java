package aplicaçao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ras, raps, ragc, gm, ge, md;
		
		System.out.print("Renda anual com salário: ");
		ras = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		raps = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ragc = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gm = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		ge = sc.nextDouble();
		
		ras = ras/12;
		
		if (ras > 3000 && ras < 5000) {
			ras = (ras*10)/100;
			ras = ras*12;
		} else if (ras > 5000) {
			ras = (ras*20)/100;
			ras = ras*12;
		} else {
			ras = 0.0;
		}
		
		if (raps > 0) {
			raps = (raps*15)/100;
		} else {
			raps = 0.0;
		}
		
		if (ragc > 0) {
			ragc = (ragc*20)/100;
		} else {
			ragc = 0.0;
		}
		
		md = (30*(ras+ragc+raps))/100;
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", ras);
		System.out.printf("Imposto sobre serviços: %.2f%n", raps);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", ragc);
		
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", md);
		System.out.printf("Gastos dedutíveis: %.2f%n", (gm+ge));
		
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", ras+ragc+raps);
		System.out.printf("Abatimento: %.2f%n", md);
		System.out.printf("Imposto devido: %.2f%n", (ras+ragc+raps)-md);
		
		sc.close();
	}

}
