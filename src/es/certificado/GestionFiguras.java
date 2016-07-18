package es.certificado;

import java.util.Scanner;

public class GestionFiguras {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		String color;
		float base, altura, radio;

		do {
			System.out.println("1. Crear Tri�ngulo");
			System.out.println("2. Crear C�rculo");
			System.out.println("3. Crear Rect�ngulo");
			System.out.println("4. Salir");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Introduzca base: ");
				base = sc.nextFloat();
				System.out.println("Introduzca altura: ");
				altura = sc.nextFloat();
				System.out.println("Introduzca color: ");
				color = sc.next();
				pinta(new Triangulo(base, altura, color));
				break;

			case 2:
				System.out.println("Introduzca base: ");
				base = sc.nextFloat();
				System.out.println("Introduzca altura: ");
				altura = sc.nextFloat();
				System.out.println("Introduzca color: ");
				color = sc.next();
				pinta(new Rectangulo(base, altura, color));
				break;

			case 3:
				System.out.println("Introduzca radio: ");
				radio = sc.nextFloat();
				System.out.println("Introduzca color: ");
				color = sc.next();
				pinta(new Circulo(radio, color));
				break;
			}
		} while (opcion != 4);

	}

	public static void pinta(Figura f) {
		// invoca a la versi�n de los m�todos implementadas
		// en la subclase de Figura pasada como par�metro
		System.out.println("Area: " + f.area());
		System.out.println("Color: " + f.getColor());
	}

}
