package es.certificado.tema6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;



public class Agenda2 {
	private final String path="src/agenda.obj";
	private Hashtable<String, Persona2> perHash;
	
	public Agenda2() throws IOException, ClassNotFoundException {
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			fi = new FileInputStream(path);
			oi = new ObjectInputStream(fi);
			perHash = (Hashtable)oi.readObject();
			oi.close();
		} catch (FileNotFoundException e) {
			perHash = new Hashtable<String, Persona2>();
		}
	}

	boolean agregar(String dni, String nom, long tel) {
		if (!perHash.containsKey(dni)) {
			Persona2 persona = new Persona2(dni, nom, tel);
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

	Persona2 recuperar(String dni) {
		if (perHash.containsKey(dni)) {
			return perHash.get(dni);

		} else {
			return null;
		}
	}

	Enumeration<String> total() {
		return perHash.keys();
	}
	
	public void guardar() throws IOException {
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(perHash);
		oo.close();
	}
}
