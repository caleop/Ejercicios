package es.certificado.tema6;

public class Oca {
	public static void main(String... args) {
		int a = 10; String name = null;
		try {
		a = name.length();
		a++;
		}
		catch (RuntimeException e){
		++a;
		}
		System.out.println(a);
		String pepe;
		Person peson = new Person();
		System.out.println(peson.name + peson.height + peson.age);
	}
}

class Person {
	int age;
	float height;
	boolean result;
	String name;
}