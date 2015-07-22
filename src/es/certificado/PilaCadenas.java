package es.certificado;

import java.util.Scanner;

public class PilaCadenas {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		String cad;
		Pila<String> pila = new Pila<String>();
		
		do {
			System.out.println("Elegir opción:\n");
			System.out.println("1. Agregar cadena");
			System.out.println("2. Quitar cadena");
			System.out.println("3. Mostrar todas");
			System.out.println("4. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduzca cadena: ");
				sc.nextLine();
				cad = sc.nextLine();
				pila.agregar(cad);
				break;
			case 2:
				pila.quitar();
				break;
			case 3:
				imprime(pila);
				break;
			}
		} while (opcion != 4);
	}
	
	public static void imprime(Pila p) { 
		//recorre la Pila y muestra su contenido 
		for(int i=0;i<p.total();i++) {
			System.out.println(p.obtener(i));
		}
	}
}