package com.ejemplos.excepciones;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainExcFile { 
	
	public static void main(String[] args) throws SQLException {
		File file = new File("protected/hola.txt");
		System.out.println(file.getAbsolutePath());
	}
}