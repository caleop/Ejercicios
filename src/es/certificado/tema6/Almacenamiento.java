package es.certificado.tema6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Almacenamiento {

	public static void main(String[] args) throws IOException {

		FileOutputStream fs = new FileOutputStream("src/datos.obj");
		ObjectOutputStream os = new ObjectOutputStream(fs);

		os.writeObject(new Persona("javi", 39));
		os.close();
	}
}
