package br.com.pc2.semana4;

import javax.swing.JOptionPane;

public class UsandoWhile1 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
		while (!s.toLowerCase().equals("sair")) {
			System.out.println("Frase digitada: " + s);
			s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
		}

	}

}
