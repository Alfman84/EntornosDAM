package com.ejemplos.arrays;

public class Ejemplo2 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		int otrosNumeros[] = {2,'A',34,6};
		char mander[] = new char[10];
		char milion[] = {67, 65, 'R', 'M', 65, 'L', 'I', 'O', 'N'};
		
		System.out.println("este es el 2º numero de otrosNumeros: " + otrosNumeros);
		
		System.out.println("este es el caracter 10 de milion: " + milion[8]);
		
		int l;
		l = numeros.length;
		System.out.println("Longitud de numeros: " + l);
		
		l = otrosNumeros.length;
		System.out.println("Longitud de otrosNumeros: " + l);

		for (int i=0;i<milion.length;i++)
			System.out.print(milion[i]); {
				
			}
	}

}
