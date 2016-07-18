package es.certificado.tema9;

public class Principal {
	public static void main(String[] args) {
		// Se crea un �nico objeto tarearb, el cual
		// es compartido por todos los thread
		TareaRb t = new TareaRb();
		// Las tres tareas son instancias de la
		// clase Thread
		Thread t1 = new Thread(t, "pepe");
		Thread t2 = new Thread(t, "ana");
		Thread t3 = new Thread(t, "juan");
		// Los Thread se ponen en ejecuci�n
		t1.start();
		t2.start();
		t3.start();
	}
}