package es.certificado.tema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsultaLibro {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		String isbn;
		String nuevaBusqueda;
		DatosLibro dl = null;
		
		do {
			Libro libro = null;
			
			System.out.println("Introduzca ISBN del libro: ");
			isbn = bf.readLine();
			dl = new DatosLibro("biblios");
			
			if (dl.existe(isbn)) {
				libro = dl.getLibro(isbn);
			}
			
			muestraDatos(libro);
			System.out.println("¿Desea realizar una nueva búsqueda?(s/n)");
			nuevaBusqueda = bf.readLine();
		} while (!nuevaBusqueda.equalsIgnoreCase("n"));
	}
	
	public static void muestraDatos(Libro libro) {
		if (libro != null) {
			System.out.println("ISBN: " + libro.getIsbn());
			System.out.println("Titulo: " + libro.getTitulo());
			System.out.println("Autor: " + libro.getAutor());
			System.out.println("Precio: " + libro.getPrecio());
		} else {
			System.out.println("Lo siento, el libro no se ha encontrado");
		}
	}
}
