package es.certificado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Temperaturas {
	public static void main(String[] args) throws IOException {
		ArrayList temperaturas = new ArrayList();
		String opcion;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Elegir opción: \n");
			System.out.println("1. Añadir temperatura");
			System.out.println("2. Mostrar temperatura media");
			System.out.println("3. Mostrar temperaturas extremas");
			System.out.println("4. Salir");

			opcion = bf.readLine();

			switch (Integer.parseInt(opcion)) {
			case 1:
				double temp;
				System.out.println("Introduce la temperatura: ");
				temp = Double.parseDouble(bf.readLine());
				almacenaTemperatura(temp, temperaturas);
				break;

			case 2:
				muestraMedia(temperaturas);
				break;

			case 3:
				muestraExtremas(temperaturas);

			}
		} while (!opcion.equals("4"));
	}

	private static void almacenaTemperatura(double d, ArrayList temperaturas) {
		temperaturas.add(new Double(d));
	}

	private static void muestraMedia(ArrayList temperaturas) {
		double media = 0.0;
		for (Object tp : temperaturas) {
			media += ((Double) tp).doubleValue();
		}

		media /= temperaturas.size();
		System.out.println("La temperatura media es: " + media);
	}

	private static void muestraExtremas(ArrayList temperaturas) {
		double maxima;
		maxima=((Double)temperaturas.get(0)).doubleValue();
		double minima=maxima;
		for(Object tp:temperaturas){
			double aux;
			aux=((Double)tp).doubleValue();
			if(aux>maxima){
				maxima=aux;
				}
			if(aux<minima){
				minima=aux;
			}
		}
		System.out.println("La temperatura máxima es "+ maxima);
		System.out.println("La temperatura mínima es "+ minima);
	}
}
