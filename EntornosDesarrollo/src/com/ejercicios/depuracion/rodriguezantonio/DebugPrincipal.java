package com.ejercicios.depuracion.rodriguezantonio;

public class DebugPrincipal {
	public static void main(String[] args){
	Debug numeros = new Debug();
	System.out.print("Suma :");
	System.out.println(numeros.suma());
	System.out.print("Resta :");
	System.out.println(numeros.resta());
	System.out.print("Multiplicacion :");
	System.out.println(numeros.mult());
	System.out.print("Division :");
	System.out.println(numeros.div());
	System.out.print("Modulo :");
	System.out.println(numeros.modulo());	
	
	double montoBanco1=10;
	System.out.println("Importe final del banco1 : " + montoBanco1);
	double montoBanco2=20;
	System.out.println("Importe final del banco2 : " + montoBanco2);

	}
}
