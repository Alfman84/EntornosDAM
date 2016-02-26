package com.ejemplos.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MainLog4j {
	
	static Logger logger = Logger.getLogger(MainLog4j.class);
	
	public static void main(String[] args) {
		//PropertyConfigurator.configure("log4j.properties");
		logger.info("Iniciando el programa");
		int resultado = sumar(3,2);
		logger.info("El resultado es: " + resultado);
		resultado = dividir(4,0);
		logger.info("El resultado es: " + resultado);
		logger.info("Fin del programa");
	}

	private static int dividir(int i, int j) {
		logger.info("Dividiendo " + i + " y " + j);
		
		try{
			int res = i/j;
			return res;
		} catch(Exception e) {
			logger.error("Error en la division: " + e.getMessage());
			return -1;
		}
	}

	private static int sumar(int i, int j) {
		logger.info("Sumando " + i + " y " + j);
		return i+j;
	}
}
