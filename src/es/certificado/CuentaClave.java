package es.certificado;

import es.certificado.tema5.SaldoInsuficienteException;

public class CuentaClave extends Cuenta {
	private String clave;
	
	public CuentaClave(String c) {
		clave = c;
	}
	
	public CuentaClave(String c, float f) {
		super(f);
		clave = c;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void extraer(float c) throws SaldoInsuficienteException {
		if (getSaldo() > c) {
			super.extraer(c);
		}
	}
}
