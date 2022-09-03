package main;

import java.util.Scanner;

import dol.AMP;

public class Ejer2 {

	Scanner entrada = new Scanner(System.in);
	private double sin, VI, vO, angle = 0;
	        double AM = 0; 
	
	public void Practice() {
		AMP resultado = new AMP(AM);
		System.out.println("Muy buenas y bienvenido a esta calculadora de Altura maxima de un Proyectil");
		System.out.println();
		System.out.println("Por favor escriba la velocidad inicial del proyectil");
		VI = entrada.nextDouble();
		System.out.println("Por favor escriba el angulo del proyectil");
		angle = entrada.nextDouble();
		
		sin = Math.toRadians(angle);
		vO = VI * Math.sin(sin);
	     AM = Math.pow(vO, 2) / 19.62;
	     resultado.setAM(AM);
	     System.out.printf("La altura maxima del proyectil es de ");
	     System.out.println(resultado.getAM());
	     
	     
		
	}
}
