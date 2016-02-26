package com.ejemplos.herencia;

public class CuentaAhorro extends Cuenta {
	final static double INTERES=1.3;
	
	public double generarIntereses(){
		return this.getSaldo()*1.4;
	}
}
