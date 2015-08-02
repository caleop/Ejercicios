package es.certificado.tema5;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = -4811139990565443567L;

	public SaldoInsuficienteException() {
		super("Saldo negativo!");
	}
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
