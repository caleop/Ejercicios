package es.certificado.tema6;

import java.io.Serializable;

public class Persona implements Serializable {
	
	private static final long serialVersionUID = -1739300238280208015L;
	
	private String name;
	private int edad;

	public Persona(String name, int edad) {
		super();
		this.name = name;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
