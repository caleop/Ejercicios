package es.certificado.tema6;

import java.io.Serializable;

public class Persona2 implements Serializable{
	
	private static final long serialVersionUID = -3021650951990058201L;
	
	private String dni;
	private String nombre;
	private long telefono;
	
	public Persona2(String dni, String nombre, long telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
}
