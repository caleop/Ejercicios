package es.certificado;

import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {

	private Hashtable<String, Persona> perHash = new Hashtable<String, Persona>();

	boolean agregar(String dni, String nom, long tel) {
		if (!perHash.containsKey(dni)) {
			Persona persona = new Persona();
			persona.setDni(dni);
			persona.setNombre(nom);
			persona.setTelefono(tel);
			perHash.put(dni, persona);
			return true;
		} else {
			return false;
		}
	}

	boolean eliminar(String dni) {
		if (perHash.containsKey(dni)) {
			perHash.remove(dni);
			return true;
		} else {
			return false;
		}
	}

	Persona recuperar(String dni) {
		if (perHash.containsKey(dni)) {
			return perHash.get(dni);

		} else {
			return null;
		}
	}

	Enumeration<String> total() {
		return perHash.keys();
	}
}
