package es.certificado.tema5;

public class PruebasCortas {
	public static void main(String[] args) {
		int x = -4;
		procesa(x);
	}

	static void procesa(int num) {
		// aserción
		assert (num > 0) : num + " no es positivo";
	}
}
