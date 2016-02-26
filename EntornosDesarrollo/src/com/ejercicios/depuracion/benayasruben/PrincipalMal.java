package com.ejercicios.depuracion.benayasruben;

public class PrincipalMal {
	public static void main(String[] args) {

		Mal f1 = new Mal(1, 4);
		Mal f2 = new Mal(1, 2);
		Mal f3 = new Mal ();
		Mal f4 = new Mal(4);
		Mal suma = f1.sumar(f2);
		Mal resta = f1.restar(f3);
		Mal producto = f1.multiplicar(f4);
		Mal cociente = f1.dividir(f2);
    System.out.println(f1 + " + " + f2 + " = " + suma);
    System.out.println(f1 + " - " + f3 + " = " + resta);
    System.out.println(f1 + " * " + f4 + " = " + producto);
    System.out.println(f1 + " / " + f2 + " = " + cociente);
	}
}
