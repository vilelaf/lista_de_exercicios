package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			double fahrenheit;
			double celsius;
			
			System.out.println("Insira uma temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit - 32) * 5/9 ;
			
			System.out.println("Temp em Fahrenheit: " + fahrenheit + "°.");
			System.out.printf("Convertido em Celsius: "+ "%.2f" + "°." +"\n", celsius );
			
		}
		catch (Exception e) {
			System.out.println("Insira apenas valores double: " + e.getMessage());
		
		}
		
		sc.close();
	}

}
