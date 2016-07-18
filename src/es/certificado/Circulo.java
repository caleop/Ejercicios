package es.certificado;

public class Circulo extends Figura { 

	private float radio;
	
	public Circulo(float r, String c) {
		super(c);
		radio=r;
	}
	
	public float area() {
		return (float)Math.PI*radio*radio;
	}
}
