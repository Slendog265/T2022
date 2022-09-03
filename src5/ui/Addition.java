package ui;

import java.util.Scanner;

import dol.MS;

public class Addition {
	int X,y, Suma;
	Scanner entry = new Scanner(System.in);
	
	
	
	
	public void Ecuacion() {
		MS resultado = new MS(X, Suma);
		System.out.println("Usted selecciono una suma de dos numeros.");
		System.out.println("Por favor escoga un valor para X");
		X = entry.nextInt();
		System.out.println("Ahora por favor escoga un valor para Y");
		y = entry.nextInt();
		
		Suma = X + y;
		resultado.setSuma(Suma);
		
		System.out.printf("La suma seria %s%n%n", resultado.getSuma());
		
	}

}
