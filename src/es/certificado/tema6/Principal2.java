package es.certificado.tema6;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

public class Principal2 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Agenda2 agenda = new Agenda2();
		String nom, dni;
		long tel;
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Elegir opción:\n");
			System.out.println("1. Agregar persona");
			System.out.println("2. Buscar persona");
			System.out.println("3. Eliminar persona");
			System.out.println("4. Mostar todas las personas");
			System.out.println("5. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				
			
				System.out.println("Introduce nombre: ");
				sc.nextLine();
				nom = sc.nextLine();
				System.out.println("DNI: ");
				dni = sc.nextLine();
				System.out.println("Telefono: ");
				tel = sc.nextLong();
				if (agenda.agregar(dni , nom,  tel)) {
					System.out.println("Agregado");
				} else {
					System.out.println("No agregado");
				};				
				break;

			case 2:
				System.out.println("Introduzca el dni: ");
				dni = sc.next();
				Persona2 paux = agenda.recuperar(dni);
				if (paux != null) {
					System.out.println(paux.getDni());
					System.out.println(paux.getNombre());
					System.out.println(paux.getTelefono());
				}
				break;
				
			case 3:
				System.out.println("Introduzca dni a borrar: ");
				dni = sc.next();
				if (agenda.eliminar(dni)) { 
					System.out.println("Se ha borrado la persona");
				}
				break;	
			case 4:
				Enumeration<String> tot = agenda.total();
				while (tot.hasMoreElements()) {
					String d = tot.nextElement();
					Persona2 peraux = agenda.recuperar(d);
					if (peraux != null) {
						System.out.println(peraux.getDni() + " - " +
								peraux.getNombre() + " - " +
								peraux.getTelefono());
					}
				}
				break;
			case 5:
				agenda.guardar();
				break;
				
			}
		} while (opcion != 5);
		sc.close();
	}
}
