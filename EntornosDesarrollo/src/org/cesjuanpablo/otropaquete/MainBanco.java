package org.cesjuanpablo.otropaquete;
/* Hola */

import com.ejemplos.herencia.Cuenta;
import com.ejemplos.herencia.CuentaAhorro;
import com.ejemplos.herencia.CuentaCorriente;

// adios


public class MainBanco {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		CuentaCorriente cuenta2 = new CuentaCorriente();
		CuentaAhorro cuenta3 = new CuentaAhorro();
		
		cuenta1.setNCuenta(2335);
		cuenta1.titular = "Ángel de Oro Romo";
		cuenta1.setSaldo(-100000);
		
		cuenta2.setNCuenta(2336);
		cuenta2.titular = "Sergio Fortes";
		cuenta2.setSaldo(800000);
		
		mostrarSaldoTotal(cuenta1.getSaldo(), cuenta2.getSaldo());
		
		Cuenta cuenta[] = new Cuenta[5];
		cuenta[0] = cuenta1;
		cuenta[1] = cuenta2;
		cuenta[2] = cuenta3;		
		for (int i = 0; i < cuenta.length; i++) {
			Cuenta cuenta4 = cuenta[i];
			System.out.println(cuenta4.getSaldo());
			
		}

	}
	
	/**
	 * 
	 * @param saldo1 valor de la primera cuenta
	 * @param saldo2 valor de la segunda cuenta
	 * @return retorna un string con el resultado de la suma
	 * @author anonymous
	 */
	public static String mostrarSaldoTotal(double saldo1, double saldo2)
	{
		return String.valueOf(saldo1+saldo2);
	}

}
