package com.ejemplos.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainExcDB {

	static Connection conn; 
	
	public static void main(String[] args) {
		
			try {
				conn = crearConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		realizarConsulta();
		
		cerrarConexion(conn);

	}
	
	public static Connection crearConexion() throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Usuario: ");
			String user = sc.nextLine();
			String pass = "dam2015";
			String url = "jdbc:mysql://localhost:3306/restaurante";
			return DriverManager.getConnection(url, user, pass);
		}
	}
	
	public static void realizarConsulta()
	{
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select nombre_p from plato");
			int i = 1;
			while (rs.next())
			{
				System.out.println("Plato " + i + ": " + rs.getString("nombre_p"));
				i++;
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void cerrarConexion(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
