package ui;

import java.util.Scanner;

import dol.MRU;

public class distanceForm {

	private Scanner entry = new Scanner(System.in);
	

	public void ecuacion() {
	
		double d = 0;
		double v = 0;
		double t = 0;
		MRU distancia = new MRU(d, v, t);
		
		System.out.println("Por favor escriba la velocidad");
		       v = entry.nextDouble();
		System.out.println("Por favor escriba el tiempo");
		       t = entry.nextDouble();
		d = v * t;
		distancia.Distance(d);
		System.out.println("Su distacian seria");
		System.out.print(distancia.ResulDist());
		
		
	}
}
