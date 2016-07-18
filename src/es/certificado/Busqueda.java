package es.certificado;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Busqueda {
	public static void main(String[] args) {
		// formato de la cadena de búsqueda
		String patron = "www\\.\\w*\\.es";
		String direcciones = "La direccion de búsqueda ";
		direcciones += "es www.search.es, aunque para ";
		direcciones += "navegar, mejor www.boat.es. ";
		direcciones += "Para informarse: www.news.es.";
		// creción de los objetos Pattern y Matcher
		Pattern p = Pattern.compile(patron);
		Matcher m = p.matcher(direcciones);
		// recuperación de todas las coincidencias
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}