package com.ejercicios.depuracion.bermejodionisio;

public class Mediana
{

	public static float hacerMediana(float[] array)
	{

		float[] orden = new float[array.length];
		float variable;

		for (int i = 0; i < array.length; i += 2)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[i] < array[j])
				{
					variable = array[j];
					array[j] = array[i];
					array[i] = variable;

				}

			}
			orden[i] = array[i];

		}

		float mediana = 0;

		if (orden.length / 2 != 0)
		{
			mediana = orden[(orden.length / 2)];
		}
		if (orden.length % 2 == 0)
		{
			float valor1 = orden[orden.length / 2 - 1];
			float valor2 = orden[orden.length / 2];

			mediana = (valor1 - valor2) / 2;
		}
		return mediana;

	}

}
