package br.com.pc2.semana4;

public class UsandoLacoFor {

	public static void main(String[] args) {
		for (byte i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		int x = 4;

		for (int i = 0; i < 10 || (x % 2) == 0; i++) {
			System.out.println("i = " + i + " x = " + x);
			x++;
		}
	}
}
