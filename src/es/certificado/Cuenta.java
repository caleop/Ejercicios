package es.certificado;

public class Cuenta {
	
	private float saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	public Cuenta(float saldo) {
		this.saldo = saldo;
	}
	
	
	void ingresar(float c) {
		this.saldo += c;
	}
	
	void extraer(float c) {
		this.saldo -= c;
	}
	
	float getSaldo() {
		return this.saldo;
	}
}
