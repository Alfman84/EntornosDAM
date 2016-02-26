package com.ejercicios.depuracion.rodriguezantonio;

public class Debug2 {
	    public static void main(String args[]){
	       int meses = 12;
	       float interesBanco1 = 1f;
	       float bonificBanco1 = 5f;
	       float interesBanco2 = 1.5f;
	       double monto = 10000;
	       double montoBanco1 = monto;
	       double montoBanco2 = monto;
	       for ( int n = 1; n <= meses; n++){
	          montoBanco1 += montoBanco1 * interesBanco1 / 100;
	       }
	       montoBanco1 += montoBanco1 * bonificBanco1 /100;
	       for ( int n = 1; n <= meses; n++){
	          montoBanco2 += montoBanco2 * interesBanco2 / 100;
	       }
	    }
	    
	    public static void primo(String args[]){
	    	int n = Integer.valueOf(args[5]);
	    	
	    	for(int candidato=3; candidato<=n; candidato+=2)
	    		{
	    		boolean esPrimo=true;
	    		int divisor = 3;
	    		{
       		 if (candidato % divisor == 0)
       		 {
       			 esPrimo = false;
       		 } else
       			 divisor++;
       		 if (divisor == candidato)
       		 {
       			 System.out.print (candidato+" ");
       			 break;
       		 }
       	 }
        }
    }
}


