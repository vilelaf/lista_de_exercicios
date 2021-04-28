package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {

	// Enquanto a for diferentes de null. - Lógica
	
	public static class Circulo{
		
		Double raio;

		public Circulo(Double raio) {
			this.raio= raio;
		}

		public Circulo() {
		}

		public double area() {
			return Math.PI * raio;
		}
		
		public double perimetro() {
			return (Math.PI * Math.PI) * raio; 
		}
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		try {
			System.out.println("Digite o raio: ");
			double r = sc.nextDouble();

			Circulo c = new Circulo(r);
			System.out.printf("Area do circulo: " + "%.2f\n", c.area());
			System.out.printf("Perímetro do círculo: " + "%.2f\n", c.perimetro());
			
		}
		catch (RuntimeException e) {
			System.out.println(" Insira um formato válido.  " + e.getMessage());
		}
		
		sc.close();

	}

}