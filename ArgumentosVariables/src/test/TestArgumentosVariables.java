package test;

public class TestArgumentosVariables {

	public static void main(String[] args) {
		
	imprimirNumeros(61, 35, 89, 45, 32);
	imprimirNombreYNumeros("Alberto", 77, 77, 77);

	}
	
	//Aca imprime solo números - "int...numeros" es un varargs
	private static void imprimirNumeros(int...numeros) {	
		System.out.println("Arreglo int");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elementos: " + numeros[i]);
			
		}
	}
	
	//Acá nombre y números, pero el string u otro siempre debe ir primero que el varargs 
	private static void imprimirNombreYNumeros(String nombre, int...numeros) {
		System.out.println("\nString y arreglo int");
		System.out.println("Nombre: " + nombre);
		for (int i = 0; i < numeros.length; i++) {			
			System.out.println("Elementos: " + numeros[i]);
			
		}
	}

}
