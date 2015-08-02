package es.certificado;

public class Triangulo extends Figura {
	
	private float base,altura;
	
	public Triangulo(float b,float a, String c) {
		super(c);
		base=b;
		altura=a;
	}
	
	public float area() {
		return base*altura/2; 
	}
}
