package test;

public class TestArreglos {

	public static void main(String[] args) {

		int edades[] = new int[3];
		System.out.println("Variable de edades: " + edades[0]);
		
		edades[0] = 10;
		
		System.out.println("Variable de edades: " + edades[0]);
		
		for(int i = 0; i < edades.length ; i++) {
			edades[i] = i;
			System.out.println("Variable de edades: " + edades[i]);
		}

	} 

}
