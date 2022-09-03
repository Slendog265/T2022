package ui;

import dol.MS;

public class Random {
	double x;
	MS resultado = new MS(x, 0);
	
	public void X() {
		
		
		x = Math.random() * (10000 + 1);
		resultado.setX(x);
		System.out.printf("Su numero es %s%n%n", resultado.getX());
		
	}
	
}
