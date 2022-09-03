package ui;

import java.util.Scanner;

import dol.MRU;

public class timeForm {

	private Scanner entrada = new Scanner(System.in);
	
	public void ecuacion() {
		
		double d = 0;
		double v = 0;
		double t = 0;
		MRU tiempo = new MRU(d, v, t);
		
		System.out.println("Por favor escriba la distancia");
		       d = entrada.nextDouble();
		System.out.println("Por favor escriba la velocidad");
		       v = entrada.nextDouble();
		t = d / v;
		tiempo.time(t);
		System.out.println("Su distacian seria");
		System.out.print(tiempo.ResultTime());
		

	
	
		
	}

}
