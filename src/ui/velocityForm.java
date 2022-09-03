package ui;

import java.util.Scanner;

import dol.MRU;

public class velocityForm {

	
	Scanner entrada = new Scanner(System.in);
	
	public void ecuacion() {
		
		double d = 0;
		double v = 0;
		double t = 0;
		MRU velocidad = new MRU(d, v, t);
		
		System.out.println("Por favor escriba la distancia");
	       d = entrada.nextDouble();
	System.out.println("Por favor escriba el tiempo");
	       t = entrada.nextDouble();
	v = d / t;
	velocidad.Velocity(v);
	System.out.println("Su velocidad seria");
	System.out.print(velocidad.ResultVelo());
		
	}

}
