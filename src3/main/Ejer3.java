package main;

import java.util.Scanner;

import dol.NP;

public class Ejer3 {

	int num, i;
	boolean primo = true;
	Double prime;
	public void practice() {
		Scanner entrada = new Scanner(System.in);
		NP resultado = new NP(i);
		 
		 System.out.println("Por favor escriba un numero");
		   num = entrada.nextInt();
			
			for( i = 2; i < num; i++) {
		        if (num % i == 0) {
		            primo = false;
		            resultado.setPrimeNUmb(i);
		            break;
		        }
		    }
		    if (primo)
		        System.out.printf("El numero es primo ya que es divisible entre si. %s%n%n", resultado.getPrimeNUmb()); 
		   
		    else
		        System.out.printf("El numero no es primo ya se obtuvo un residuo distinto de 0. Siendo %d%n = %s%n%n", num,resultado.getPrimeNUmb());
		    
		}
	}

