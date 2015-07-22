package es.certificado;

public class Ejercicio1 {
	public static void main(String[] args) { 
		Wrapper<String> w=new Wrapper<String>();
		w.setData("mi cadena");
		String d=w.getData();
		System.out.println("La cadena es: "+d);
		
		Float floa = new Float(3.0);
		byte bit= 8;
		Integer bi = new Integer(9);
		bi.floatValue();
		System.out.println(bi.floatValue());
	}
}

