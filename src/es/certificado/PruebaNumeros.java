package es.certificado;

import java.io.IOException;

public class PruebaNumeros {
	public static void main(String[] args) throws IOException{
		LecturaNumeros ln = new LecturaNumeros();
		
		int num, num2;
		Integer kk;
		System.out.println("int ");
		num = ln.readInt();
		System.out.println("int mensaje ");
		num2 = ln.readInt("mensaje int");
		System.out.println("Integer ");
		kk = ln.readInteger();
		/*System.out.println("double ");
		System.out.println("double mensaje ");*/
		System.out.println();
		System.out.println(num);
		System.out.println(num2);
		System.out.println(kk);
	}
}
