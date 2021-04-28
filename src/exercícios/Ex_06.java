package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Digite dois valores inteiros: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double qdiv = x/y;
			double rdiv = x%y;
			
			System.out.printf("O quociente da divisão é : " + "%.2f\n", qdiv);
			System.out.printf("O resto da divisão é : " + "%.2f\n", rdiv);
			
		} 
		catch (Exception e) {
			System.out.println("Insira apenas números inteiros.");
		}
		
		sc.close();
	}

}
