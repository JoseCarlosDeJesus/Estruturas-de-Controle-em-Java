package br.com.pc2.semana4;

public class EstruturaControle3 {

	public static void main(String[] args) {
		char conceito = 'A';
		double valor = 500.0;
		switch (conceito) {
		case 'A':
			valor = calcularMensalidade(500.0, 50.0);
			break;
		case 'B':
			valor = valor * 0.6;
			break;
		case 'C':
			valor = valor * 0.7;
			break;
		case 'D':
			valor = valor * 0.8;
			break;
		case 'E':
			valor = valor * 0.9;
			break;
		case 'F':
			valor = valor;
			break;
		default:
			System.out.println("Conceito desconhecido");
		}
		System.out.println("Valor da mensalidade: " + valor);

	}
	
	private static double calcularMensalidade(double valor, double percentual) {
		return valor*(percentual/100);
	}

}
