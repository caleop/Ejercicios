package es.certificado;
import java.util.Enumeration;
import java.util.Hashtable;

public class RecorrerHashTable {
	public static void main(String[] args) {
		String clave, valor;
		Hashtable ht = new Hashtable();
		ht.put("05", "pepito");
		ht.put("78", "javito");
		Enumeration enu = ht.keys();
		while (enu.hasMoreElements()) {
			clave =(String) enu.nextElement();
			System.out.println(clave);
			valor =(String) ht.get(clave);
			System.out.println(valor);
		}
		
	}
}
