package es.certificado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws IOException {
		
		//int[] notas = null;
		int nota = 0;
		int contador = 0;
		int total = 0;
		int min = 10;
		int max = 0;
		int media;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca la nota");
		nota = Integer.parseInt(bf.readLine());
		
		while (nota >= 0)   {
		
			if (nota > max) {
				max = nota;
			} 
			if (nota < min) {
				min = nota;
			}
			total += nota;
			//notas[contador] = nota;
			contador ++;
			System.out.println("Introduzca la nota");
			nota = Integer.parseInt(bf.readLine());
		} 
		
		media = total / contador;
		System.out.println("El número de notas introducidas son: " + contador);
		System.out.println("La nota máxima ha sido: " + max);
		System.out.println("La nota mínima ha sido: " + min);
		System.out.println("La media ha sido: " + media);
		
	}
}
