package es.certificado;

import java.util.Scanner;

public class GestionCajero {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int opcion;
		CuentaClave cuenta = null;
		do {
			System.out.println("1. Crear cuenta vacía");
			System.out.println("2. Crear cuenta saldo inicial");
			System.out.println("3. Ingresar dinero");
			System.out.println("4. Sacar dinero");
			System.out.println("5. Ver saldo");
			System.out.println("6. Salir");
			System.out.println("Elige opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce la clave para la cuenta: ");
				String cod = sc.next();
				cuenta = new CuentaClave(cod);
				break;
			case 2:
				System.out.println("Introduce la clave para la cuenta: ");
				cod = sc.next();
				float cantini;
				System.out.println("Saldo inicial: ");
				cantini = sc.nextFloat();
				cuenta = new CuentaClave(cod, cantini);
				break;
			case 3:
				float ingreso;
				System.out.println("Cantidad a ingresar: ");
				ingreso = sc.nextFloat();
				cuenta.ingresar(ingreso);
				break;
			case 4:
				float extraccion;
				System.out.println("Cantidad a sacar: ");
				extraccion = sc.nextFloat();
				cuenta.extraer(extraccion);
				break;
			case 5:
				System.out.println(cuenta.getSaldo());
			}

		} while (opcion != 6);
	}
}
