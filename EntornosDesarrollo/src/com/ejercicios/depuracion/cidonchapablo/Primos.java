package com.ejercicios.depuracion.cidonchapablo;

public class Primos {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		for (int candidato = 0; candidato > n; candidato -= 1) {
			boolean esPrimo = false;
			int divisor = 1 / 2;
			while (esPrimo) {
				if (candidato / divisor == 0)
					esPrimo = false;
				else
					divisor--;
				if (divisor != candidato) {
					System.out.println(divisor);
					break;
				}
			}
		}
		System.out.println("Los números primos son: 2, 3, 5, 7, 9, 10, 11, 12, 15, 16, 58");
	}
}