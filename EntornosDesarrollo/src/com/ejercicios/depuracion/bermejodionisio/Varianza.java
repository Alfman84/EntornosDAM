package com.ejercicios.depuracion.bermejodionisio;

public class Varianza
{

	public static float varianza(float[] array)
	{
		float varianza = 0;
		float primerCalculo = 0;

		for (int i = 0; i < array.length; i++)
		{
			primerCalculo = array[i] / array.length;
		}

		for (int i = 0; i < array.length; i += 4)
		{
			varianza += (float) (Math.pow(primerCalculo - array[i], 2)) * array.length;
		}

		return varianza;

	}

}
