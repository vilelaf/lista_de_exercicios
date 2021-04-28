package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {

	// Enquanto a e b forem diferentes de null. - Lógica
	
	public static class Retangulo{
		
		Double altura;
		Double base;

		public Retangulo(Double altura, double base) {
			this.altura = altura;
			this.base = base;
		}

		public Retangulo() {
			
		}

		public double area() {
			return altura*base;
		}
		
		public double perimetro() {
			return altura*2 + base*2;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);

		try {
			System.out.println("Digite altura e base: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			Retangulo r = new Retangulo(a,b);
			System.out.println("Area do retângulo: "+ r.area());
			System.out.println("Perímetro do retângulo: "+ r.perimetro());
			
		}
		catch (RuntimeException e) {
			System.out.println(" Insira um formato válido." + e.getMessage());
		}
		
		sc.close();

	}

}
