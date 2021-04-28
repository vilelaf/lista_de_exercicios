package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Por favor, digite idade, meses, e dias");
			int idade = sc.nextInt();
			int meses = sc.nextInt();
			int dias = sc.nextInt();

			
			while (meses > 11) {
				System.out.println("Por favor insira um valor real em meses: ");
				meses = sc.nextInt();
			}
			while (dias > 31) {
				System.out.println("Por favor insira um valor real referente aos dias: ");
				dias = sc.nextInt();
			}
			
			System.out.println(" == Dados inseridos == ");
			System.out.println(" IDADE =  " + idade +" MESES =  " + meses + " DIAS =  " + dias);
		}
		catch (Exception e) {
			System.out.println("Insira apenas valores inteiros: " + e.getMessage());
		}
		
		sc.close();
	}

}
