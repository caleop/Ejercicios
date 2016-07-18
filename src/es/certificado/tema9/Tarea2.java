package es.certificado.tema9;

public class Tarea2 extends Thread {

	
	
	@Override
	public void run() {
		for (int i = -1; i >= -100; --i) {
			System.out.println("El numero es " + i);
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
