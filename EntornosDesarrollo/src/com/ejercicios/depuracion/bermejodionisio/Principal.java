package com.ejercicios.depuracion.bermejodionisio;

public class Principal
{

	public static void main(String[] args)
	{
		float[] array1 = { 6, 2, 5, 5, 5, 4, 4, 3, 6 };
		float[] array2 = { 7, 8, 9, 12, 11, 10 };
		float[] array4 = {};

		System.out.println("La mediana de array1 es: " + Mediana.hacerMediana(array1));

		System.out.println("La mediana de array2 es: " + Mediana.hacerMediana(array2));

		float[] array3 = { 9, 3, 8, 8, 9, 8, 9, 18 };

		System.out.println("La varianza de array3 es: " + Varianza.varianza(array3));

		System.out.println("La desviacion tipica de array3 es: " + DesviacionTipica.desviacionTipica(array4));
	}
}
