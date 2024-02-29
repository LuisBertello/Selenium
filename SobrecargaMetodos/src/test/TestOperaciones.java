package test;

import operaciones.Operaciones;

public class TestOperaciones {
	
	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		
		System.out.println("Resultado: " + operaciones.sumar(4, 8));
		System.out.println("Resultado: " + operaciones.sumar(4.5, 6.8));
	}

}
