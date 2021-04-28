package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_09 {

	public static class LataDeOleo{
		
		double raio;
		double altura;
	
		public LataDeOleo(double raio, double altura) {
		
			this.raio = raio;
			this.altura = altura;
		}
	
		public double volumeLata() {
			return Math.PI * Math.pow(raio, 2) * altura;
		}
	
	}

	public static class Conversor{
		
		public void meuConversor(LataDeOleo lt) {
			if (lt.volumeLata()/1000 < 1) {
				System.out.println(lt.volumeLata()/1000 + " mililitros.");
			}
			else if (lt.volumeLata()/1000 >= 1 && lt.volumeLata()/1000 < 2){
				System.out.printf("%.2f"+ " litro.", lt.volumeLata()/1000 );
			}
			else {
				System.out.println(lt.volumeLata()/1000 + " litros.");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Insira os valores para o raio e a altura da lata de óleo. ");
			double raio = sc.nextDouble();
			double altura = sc.nextDouble();
			
			LataDeOleo lt = new LataDeOleo(raio, altura);
			
			Conversor c = new Conversor();

			System.out.printf("O volume da lata é " + "%.2f\n", lt.volumeLata());
			c.meuConversor(lt);

		} 
		catch (Exception e) {
			System.out.println("Insira apenas reais da lata: " + e.getMessage());
		}	
		
		sc.close();
	}		
}
