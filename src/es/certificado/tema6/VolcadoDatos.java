package es.certificado.tema6;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class VolcadoDatos {

	public static void main(String[] args) throws IOException {
		DataInputStream ds = new DataInputStream(new FileInputStream(
				"src/array.mdb"));
		try {
			for (;;) {
				System.out.println(ds.readInt());
			}
		} catch (EOFException e) {
			System.out.println("fin archivo");
		}

	}

}
