package br.com.pc2.semana4;

import javax.swing.JOptionPane;

public class UsandoDoWhile1 {

	public static void main(String[] args) {
		String s = "";
		do {
			s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
			if(!s.equalsIgnoreCase("sair")) {
				System.out.println("Frase digitada: " + s);				
			}
		} while (!s.toLowerCase().equals("sair"));

	}

}
