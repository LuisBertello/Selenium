package test;

import java.util.Iterator;

public class Matrices {

	public static void main(String[] args) {

		int edades [][] = new int [3][2];
		
		edades[0][0] = 1;
		edades[0][1] = 2;
		edades[1][0] = 3;
		edades[1][1] = 4;
		edades[2][0] = 5;
		edades[2][1] = 6;
		
		for (int reng = 0; reng < edades.length; reng++) {
			for (int col = 0; col < edades[reng].length; col++) {
				System.out.println(edades[reng][col]);
			}
		}
		
		String frutas[][] = {{"Naranja","Manzana"}, {"Uva", "Mango"}};
		for (int reng = 0; reng < frutas.length; reng++) {
			for (int col = 0; col < frutas[reng].length; col++) {
				System.out.println(frutas[reng][col]);
			}
		}

	}

}
