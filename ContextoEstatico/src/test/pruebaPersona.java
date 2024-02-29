package test;

import dominio.Persona;

public class pruebaPersona {

	public static void main(String[] args) {
		
			Persona persona1 = new Persona("Luis");
			System.out.println(persona1);
			Persona persona2 = new Persona("Alberto");
			System.out.println(persona2);
			
			imprimir(persona1);
			imprimir(persona2);

	}
	
	public static void imprimir(Persona persona) {
		System.out.println("Persona: " + persona);
	}

}
