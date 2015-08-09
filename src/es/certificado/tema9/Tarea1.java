package es.certificado.tema9;

public class Tarea1 implements Runnable {


	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("El numero es el " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
