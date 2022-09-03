package main;

import java.util.Scanner;

import dol.NF;

public class Ejer4 {

	double NF = 1;
	int num;
	Scanner entrada = new Scanner(System.in);
	
	public void practice() {
		
		NF resultado = new NF (NF);
		 System.out.println("Por favor introduzca un numero para obtener su factorial. ");
		 num= entrada.nextInt();
		 for (int i = num;i > 0; i--)
		 {
		 NF = NF * i;
		 resultado.setNF(NF);
		 
		 System.out.printf("El factorial de %d%n es  %s%n%n" , num, resultado.getNF());
		 
		 

		 }
		}
		
	}
	

