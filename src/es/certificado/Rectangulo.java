package es.certificado;

public class Rectangulo extends Figura {

	private float base,altura;
	
	public Rectangulo(float b,float a, String c) {
		super(c);
		base=b;
		altura=a;
	}
	
	public float area() {
		return base*altura;
	}
}
