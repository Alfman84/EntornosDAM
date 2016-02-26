package com.ejemplos;

import java.util.Scanner;

public class Nochevieja {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Atributos
		int array[] = new int[100];
		String hora;

		//Inicializar array		
		for (int a=0;a<100;a++)	array[a]=-1;
		
		
		System.out.println("Introduzca una hora");
		hora=sc.next();
				
		int t=Integer.parseInt(hora.substring(0,2))*60+Integer.parseInt(hora.substring(3,5));
		
			int p=0;
			while (!hora.equals("00:00") || (!hora.equals("24:00")))
			{
				int resultado=1440-t;
				
				array[p]=resultado;
				p++;
				
				hora=sc.next();
				Integer.parseInt(hora.substring(0,2));
				Integer.parseInt(hora.substring(3,5));
				t=Integer.parseInt(hora.substring(0,2))*60+Integer.parseInt(hora.substring(3,5));
			}
		
		//Escribir resultados
		for (int x=0;(x<100 && (array[x]!=-1));x++) System.out.println(array[x]);
						
			
	}
}

