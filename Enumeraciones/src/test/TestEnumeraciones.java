package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

	public static void main(String[] args) {
		
		//System.out.println("Día 1: " + Dias.DOMINGO);
		//indicarDiaSemana(Dias.DOMINGO);
		
		System.out.println(Continentes.AMERICA);
		System.out.println(Continentes.AMERICA.getPaises());

	}
	
	private static void indicarDiaSemana(Dias dias) {
		
		switch (dias) {
		
		case DOMINGO:
			System.out.println("Primer día de la semana.");
			break;
		
		}
		
	}

}
