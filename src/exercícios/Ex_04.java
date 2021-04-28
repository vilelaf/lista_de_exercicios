package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	
	public static class Triangulo{
		
		Double c1;
		Double c2;
		Double c3;

		public Triangulo(Double c1, Double c2, Double c3) {
			this.c1 = c1;
			this.c2 = c2;
			this.c3 = c3;
		}

		public double perimetro() {
			return c1+c2+c3;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Digite os valores em centímetros correspondentes ao tamanho de cada lado do triângulo: ");
			System.out.println("Lado A: ");
			double a = sc.nextDouble();
			System.out.println("Lado B: ");
			double b = sc.nextDouble();
			System.out.println("Lado C: ");
			double c = sc.nextDouble();
			
			Triangulo t = new Triangulo(a,b,c);

			System.out.println("Perímetro do triângulo: "+ t.perimetro());
			
		}
		catch (RuntimeException e) {
			System.out.println(" Insira um formato válido." + e.getMessage());
		}
		
		sc.close();

	}

}