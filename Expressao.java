package br.com.pc2.semana4;

public class Expressao {
	/**
	 * @author jose
	 */
	int a;
	
	/** Desta forma que colocamos nossos comentários para serem incluídos na
	documentação gerada pelo javadoc. */

	public static void main(String[] args) {
		/*
		 * int a = 2; int b = 3; int c = 5;
		 * 
		 * double d = 4.0; double e = 3.0;
		 * 
		 * System.out.println(a*(b+c));
		 * 
		 * System.out.println(c/b);
		 * 
		 * System.out.println(d/e);
		 * 
		 * int x = -3; int y = 26;
		 * 
		 * System.out.println(x%y);
		 */
		
		/*
		 * int a = 3; int b = 4;
		 * 
		 * int c = ++a;
		 * 
		 * System.out.println("a = "+a); System.out.println("c = "+c);
		 * 
		 * int d = b++; System.out.println("b = "+b); System.out.println("d = "+d);
		 */
		
		int a = 2; int b = 3;
		
		System.out.println(a+b);
		System.out.println("a+b = "+(a+b));
		
		int c = 0;
		
		c = c + b;
		c+= b;
		
	}
	
	
	
	public void m1() {
		a = 9;
		int z = 8;
	}
	
	public void m2() {
		a = 90;
		//z = 6;
	}

}
