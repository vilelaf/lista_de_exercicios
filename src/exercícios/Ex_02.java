package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {

	// Enquanto a e b forem diferentes de null. - Lógica
	
	public static class Quadrado{
		
		Double altura;
		Double base;

		public Quadrado(Double altura, double base) {
			this.altura = altura;
			this.base = base;
		}

		public Quadrado() {
			
		}

		public double area() {
			return altura*base;
		}
		
		public double perimetro() {
			return (altura*2) + (base*2);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		
		try {
			System.out.println("Digite altura e base: ");
			double a = sc.nextDouble();
			Double b = sc.nextDouble();
			while (a == null) {
				Double a = sc.nextDouble();
			}
			Quadrado q = new Quadrado(a,b);
			System.out.printf("Area do quadrado: "+ "%.2f\n", q.area());
			System.out.printf("Perímetro do quadrado: "+ "%.2f\n", q.perimetro());
			
		}
		catch (RuntimeException e) {
			System.out.println(" Insira um formato válido." + e.getMessage());
		}
		
		sc.close();

	}

}