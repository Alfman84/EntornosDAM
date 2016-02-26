package com.ejercicios.excepciones;

import java.util.Scanner;

public class RegistroCenso {

	protected static String[] personas;
	
	public static void main(String[] args) {
		personas = new String[5];
		int opcion = 0;
		do {
			mostrarOpciones();
			opcion = leerOpcion();
			if (opcion==1) {registrarPersona();}
			else if (opcion==2) {buscarPersona();}
		} while(opcion!=3);
	}
	
	public static void buscarPersona() throws PersonaNoEncontradaException{
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		for (int i=0;i<personas.length;i++){
			if (personas[i].compareTo(nombre)==0){
				System.out.println(nombre + " encontrado en el censo");
				return;
			}
		}
		PersonaNoEncontradaException e = new PersonaNoEncontradaException();
		e.setNombre(nombre);
		throw e;
	}

}
