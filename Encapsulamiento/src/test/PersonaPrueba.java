package test;

import dominio.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Luis", 450, false);

		// No es necesario el metodo toString
		System.out.println("Persona 1: " + persona1.toString());
		System.out.println("Persona 1: " + persona1);

		persona1.setNombre("Alberto");
		persona1.setSueldo(500);
		persona1.setEliminado(true);

		System.out.println("Persona 1: " + persona1.toString());

	}

}
