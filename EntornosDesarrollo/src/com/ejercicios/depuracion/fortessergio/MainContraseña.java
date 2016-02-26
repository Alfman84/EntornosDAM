package com.ejercicios.depuracion.fortessergio;

public class MainContraseña {

	public static void main(String[] args) {
		Contraseña pass1 = new Contraseña(5,9,0,2);
		Contraseña pass2 = new Contraseña(0,0,0,0);
		pass1.Igualar(pass2);
		

	}

}
