package es.certificado.tema6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GrabarArray {
	public static void main(String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream("src/array.mdb", false);
		DataOutputStream ds = new DataOutputStream(fw);
		int[] m = { 5, 10, 3, 6 };
		for (int i = 0; i < m.length; i++) {
			ds.writeInt(m[i]);
		}
		ds.close();
	}
	
	void pepe() {
		
	}
}
