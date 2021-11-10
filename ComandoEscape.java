package br.com.pc2.semana4;

public class ComandoEscape {

	public static void main(String[] args) {
		/*
		 * divisao(5, 0);
		 * 
		 * System.out.println(calculaSaldo(4000.0, 200.0));
		 */

		/*
		 * for (int i = 0; i < 10; i++) { double num = Math.round(Math.random() * 10);
		 * if (num == 0) { break; } System.out.println(1 / num); }
		 */
		

		for (int i = 0; i < 10; i++) {
			double num = Math.round(Math.random() * 10);
			if (num == 0) {
				continue;
			}
			System.out.println(1 / num);
		}

	}

	public static void divisao(int a, int b) {
		if (b == 0) {
			System.out.println("Divisão por zero");
			return;
		}
		System.out.println("Resultado: " + a / b);
	}

	public static double calculaSaldo(double sal, double div) {
		return sal - div;
	}
}
