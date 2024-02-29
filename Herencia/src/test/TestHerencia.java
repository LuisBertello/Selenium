package test;

import java.util.Date;

import dominio.Cliente;
import dominio.Empleado;

public class TestHerencia {
	
	public static void main(String[] args) { 
	
		
	Empleado empleado1 = new Empleado("Luis", 'M', 36, "Antequera 7335", 5000);
	System.out.println("Empleado 1: ");
	System.out.println(empleado1);
	
	
	Cliente cliente1 = new Cliente(new Date(), true, "Alberto", 'F', 28, "Colon 348");
	System.out.println("Cliente 1: ");
	System.out.println(cliente1);
	}
	

}
