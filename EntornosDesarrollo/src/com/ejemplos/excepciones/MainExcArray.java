package com.ejemplos.excepciones;

import java.util.Scanner;

public class MainExcArray {

	public static void main(String[] args) {
//		int[] numeros = new int[2];
//		numeros[2] = 3;
	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i==1)
			System.out.println("Uno");
		

		int[] enteros = null;
		for (i = 0; i < enteros.length; i++) {
			
		}
		
		metodoAux();
	}

	private static String metodoNulo() {
		return null;
	}
	
	public static void metodoAux(){
		metodoAux2();
	}

	private static void metodoAux2() {	
		System.out.println(3/0);
	}

}
