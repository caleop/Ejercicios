package es.certificado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader{

	LecturaNumeros() {
		super(new InputStreamReader(System.in));
	}
	
	LecturaNumeros(Reader r) {
		super(r);
	}
	
	public int readInt() throws IOException {
		return Integer.parseInt(this.readLine());
	}
	
	public int readInt(String mensaje) throws IOException {
		System.out.println(mensaje);
		return Integer.parseInt(this.readLine());
	}
	
	public Integer readInteger() throws IOException {
		return new Integer(this.readLine());
	}
	
	public double readDouble() throws IOException {
		return Double.parseDouble(this.readLine());
	}
	
	public double readDouble(String mensaje) throws IOException{
		System.out.println(mensaje);
		return Double.parseDouble(this.readLine());
	}
}
