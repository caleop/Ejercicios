package es.certificado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) throws IOException {
		ArrayList<Double> temperaturas = new ArrayList<Double>();
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elegir opción: \n");
			System.out.println("1. Añadir temperatura");
			System.out.println("2. Mostrar temperatura media");
			System.out.println("3. Mostrar temperaturas extremas");
			System.out.println("4. Salir");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				double temp;
				System.out.println("Introduce la temperatura: ");
				temp = sc.nextDouble();
				almacenaTemperatura(temp, temperaturas);
				break;

			case 2:
				muestraMedia(temperaturas);
				break;

			case 3:
				muestraExtremas(temperaturas);

			}
		} while (opcion != 4);
	}

	private static void almacenaTemperatura(double d, ArrayList<Double> temperaturas) {
		temperaturas.add(new Double(d));
	}

	private static void muestraMedia(ArrayList<Double> temperaturas) {
		double media = 0.0;
		for (Double tp : temperaturas) {
			media += tp;
		}

		media /= temperaturas.size();
		System.out.println("La temperatura media es: " + media);
	}

	private static void muestraExtremas(ArrayList<Double> temperaturas) {
		double maxima;
		maxima = temperaturas.get(0);
		double minima=maxima;
		for(Double tp:temperaturas){
			
			
			if(tp>maxima){
				maxima=tp;
				}
			if(tp<minima){
				minima=tp;
			}
		}
		System.out.println("La temperatura máxima es "+ maxima);
		System.out.println("La temperatura mínima es "+ minima);
	}
}
