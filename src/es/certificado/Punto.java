package es.certificado;

public class Punto {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void dibujar() {
		System.out.println("Las coordenadas son " + 
				x +","+y);
	}
}
