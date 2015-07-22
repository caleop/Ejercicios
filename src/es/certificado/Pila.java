package es.certificado;

import java.util.ArrayList;

public class Pila<E> {
	ArrayList<E> array = new ArrayList<E>();
	
	 void agregar(E cad) {
		if (array.indexOf(cad) == -1) {
			array.add(cad);
		}
	}

	 void quitar() {
		if (total() > 0) {
			array.remove(total()-1);
		}
	}

	 int total() {
		return array.size();
	}

	 E obtener(int posicion) {
		
		return array.get(posicion);
	}
}
