package es.certificado.tema5;

import java.util.Scanner;

import es.certificado.Cuenta;

public class GestionCajero2 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int opcion;
		Cuenta cuenta = null;
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
				cuenta = new Cuenta();
				break;
			case 2:
				float cantini;
				System.out.println("Saldo inicial: ");
				cantini = sc.nextFloat();
				cuenta = new Cuenta(cantini);
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
				try {
					cuenta.extraer(extraccion);
				} catch(SaldoInsuficienteException se) {
					System.out.println(se.getMessage());
				}
				break;
			case 5:
				System.out.println(cuenta.getSaldo());
			}

		} while (opcion != 6);
	}
}

