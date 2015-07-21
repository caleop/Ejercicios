package es.certificado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class ListaNombres {
	public static void main(String[] args) throws IOException {
		Hashtable<String, String> nombres = new Hashtable<String, String>();
		int opcion;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		do {
			System.out.println("Elegir opción:\n");
			System.out.println("1. Añadir nombre");
			System.out.println("2. Eliminar nombre");
			System.out.println("3. Mostrar todos los nombres");
			System.out.println("4. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				String nom, dni;
				System.out.println("Introduce nombre: ");
				nom = sc.nextLine();
				System.out.println("DNI: ");
				dni = sc.nextLine();
				almacenaNombre(nom,dni,nombres);				
				break;

			case 2:
				String d;
				System.out.println("Introduzca el dni: ");
				d = sc.next();
				eliminaNobre(d, nombres);
				break;
				
			case 3:
				mostrarTodos(nombres);
				break;		
			}
		} while (opcion != 4);
	}
	
	

	private static void almacenaNombre(String n, String k, Hashtable<String, String> lista) {
		if (!lista.containsKey(k)) {
			lista.put(k, n);
		}
		
	}

	private static void eliminaNobre(String k, Hashtable<String, String> lista) {
		if (lista.containsKey(k)) {
			lista.remove(k);
		}
		
	}
	
	private static void mostrarTodos(Hashtable<String, String> lista) {
		System.out.println("Los nombres son: ");
		Enumeration<String> claves = lista.keys();
		while (claves.hasMoreElements()) {
			String k = claves.nextElement();
			System.out.println(k + " - " + lista.get(k)); 
				 
		}
		
	}

	
}
