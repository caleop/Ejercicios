package es.certificado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class ListaNombres {
	public static void main(String[] args) throws IOException {
		Hashtable nombres = new Hashtable();
		String opcion;
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		do {
			System.out.println("Elegir opción:\n");
			System.out.println("1. Añadir nombre");
			System.out.println("2. Eliminar nombre");
			System.out.println("3. Mostrar todos los nombres");
			System.out.println("4. Salir");
			opcion = bf.readLine();
			switch (Integer.parseInt(opcion)) {
			case 1:
				String nom, dni;
				System.out.println("Introduce nombre: ");
				nom = bf.readLine();
				System.out.println("DNI: ");
				dni=bf.readLine();
				almacenaNombre(nom,dni,nombres);				
				break;

			case 2:
				String d;
				System.out.println("Introduzca el dni: ");
				d = bf.readLine();
				eliminaNobre(d, nombres);
				break;
				
			case 3:
				mostrarTodos(nombres);
				break;		
			}
		} while (!opcion.equals("4"));
	}
	
	

	private static void almacenaNombre(String n, String k, Hashtable lista) {
		if (!lista.containsKey(k)) {
			lista.put(k, n);
		}
		
	}

	private static void eliminaNobre(String k, Hashtable lista) {
		if (lista.containsKey(k)) {
			lista.remove(k);
		}
		
	}
	
	private static void mostrarTodos(Hashtable lista) {
		System.out.println("Los nombres son: ");
		Enumeration claves = lista.keys();
		while (claves.hasMoreElements()) {
			String k = (String) claves.nextElement();
			System.out.println(k + " - " +lista.get(k)); 
				 
		}
		
	}

	
}
