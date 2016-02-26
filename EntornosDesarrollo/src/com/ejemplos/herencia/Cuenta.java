package com.ejemplos.herencia;

public class Cuenta {
	public String titular;
	int nCuenta;
	private double saldo;
	
	public int getNCuenta()
	{
		return nCuenta;
	}
	
	public void setNCuenta(int nuevoNumeroCuenta)
	{
		nCuenta = nuevoNumeroCuenta;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the nCuenta
	 */
	public int getnCuenta() {
		return nCuenta;
	}

	/**
	 * @param nCuenta the nCuenta to set
	 */
	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
