package aplicaçao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ras, raps, ragc, gm, ge;
		
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
		
		
		sc.close();
	}

}
