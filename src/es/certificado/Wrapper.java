package es.certificado;

public class Wrapper<E> {
	private E data;
	
	public void setData(E d) {
		data = d;
	}
	
	public E getData() {
		return data;
	}
}
