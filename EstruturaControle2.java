package br.com.pc2.semana4;

public class EstruturaControle2 {

	public static void main(String[] args) {
		char conceito = 'B';
		double valor = 500.0;
		if (conceito == 'A') {
			valor = valor * 0.5;
		} else if (conceito == 'B') {
			valor = valor * 0.6;
		} else if (conceito == 'C') {
			valor = valor * 0.7;
		} else if (conceito == 'D') {
			valor = valor * 0.8;
		} else if (conceito == 'E') {
			valor = valor * 0.9;
		} else {
			valor = valor;
		}
		System.out.println("Valor da mensalidade: " + valor);

	}

}
