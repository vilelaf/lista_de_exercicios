package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Digite um valor inteiro: ");
			int n = sc.nextInt();
			
			int soma = n + 1;
			
			System.out.println("O número digitado foi: " + n);
			System.out.println("O próximo inteiro é: " + soma);
		}
		catch (Exception e) {
			System.out.println("Insira apenas números inteiros");
		}
		finally {
			sc.close();
		}
		
	}
	
}
