package es.certificado;

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
	
	void extraer(float c) {
		if (getSaldo() > c) {
			super.extraer(c);
		}
	}
}
