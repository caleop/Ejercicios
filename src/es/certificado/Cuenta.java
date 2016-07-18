package es.certificado;

import es.certificado.tema5.SaldoInsuficienteException;

public class Cuenta {

	private float saldo;

	public Cuenta() {
		this.saldo = 0;
	}

	public Cuenta(float saldo) {
		this.saldo = saldo;
	}

	public void ingresar(float c) {
		this.saldo += c;
	}

	public void extraer(float c) throws SaldoInsuficienteException {
		if (this.saldo < c) {
			throw new SaldoInsuficienteException();
		} else {
			this.saldo -= c;
		}
	}

	public float getSaldo() {
		return this.saldo;
	}
}
