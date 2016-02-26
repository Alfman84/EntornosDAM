package com.ejercicios.excepciones;

public class PersonaNoEncontradaException extends Exception {
	String nombre;

	@Override
	public String getMessage(){
		return nombre + " no se encuentra en el censo";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
