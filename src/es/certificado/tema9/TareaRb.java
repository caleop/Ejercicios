package es.certificado.tema9;

public class TareaRb implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("nombre" + Thread.currentThread().getName());
			try { 
				Thread.sleep(100); // Pone la tarea a dormir
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
