package com.ejercicios.depuracion.fortessergio;

public class Contraseña {
	/* 1- Crear una contraseña (4 dígitos)
	 * 2- Crear una contraseña vacia
	 * 3- Igualar ambas contraseñas
	 * 		3.1-(Son diferentes)sumar un dígito
	 * 		3.2-Cuando sea igual salir del bucle
	 * 4-Imprimir por pantalla la segunda contraseña
	 * **/
	int array[]=new int[4];
	
	public Contraseña(int digito1, int digito2, int digito3, int digito4)
	{
		array[0]=digito1;
		array[1]=digito2;
		array[2]=digito3;
		array[3]=digito4;
	}
	
	
	public void Igualar(Contraseña passVacia)
	{	
		boolean digito1=false;
		boolean digito2=false;
		boolean digito3=false;
		boolean digito4=false;
		boolean igualar=false;
		while(igualar==false)
		{	
			if (digito1==false)
			{
				for(int d=0; d<10; d++)
				{
					passVacia.array[0]=d;
					if (passVacia.array[0]==this.array[0])
						digito1=true;
				
					if (digito2==false)
					{
						for(int c=0; c<10; c++)
						{
							passVacia.array[1]=c;
							if (passVacia.array[1]==this.array[1])
								digito2=true;
						
							if (digito3==false)
							{
								for(int b=0; b<10; b++)
								{
									passVacia.array[2]=b;
									if (passVacia.array[2]==this.array[2])
										digito3=true;
								
									if (digito4==false)
									{
										for(int a=0; a<10; a++)
										{
											passVacia.array[3]=a;
											if (passVacia.array[3]==this.array[3])
												digito4=true;
										}
									}
								}
							}
						}
					}
				}
			}
			igualar=true;
		}
		for (int x=0; x<passVacia.array.length;x++)
			System.out.print(passVacia.array[x]+",");
	}
	
}
