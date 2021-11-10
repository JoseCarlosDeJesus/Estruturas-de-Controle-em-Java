package br.com.pc2.semana4;

public class EstruturaControle1 {

	public static void main(String[] args) {
		int idade = 18;
		char sexo = 'M';
		if (idade >= 18 && sexo == 'M') {
			System.out.println("Você precisa servir ao exército");
		} else if (idade >= 18) {
			System.out.println("Maior de idade e sexo feminino");
		} else {
			System.out.println("Menor de idade");
		}

	}

}
