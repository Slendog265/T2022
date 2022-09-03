package main;

import java.util.Scanner;

import ui.Addition;
import ui.Random;

public class Ejer5 {
	short options = 0;
	Scanner entrada = new Scanner(System.in);
	public void displayOptions () {
		System.out.println("Bienvenido por favor seleccione una de las opciones sig:");
		System.out.println("1.Generar numero aleatorio");
		System.out.println("2.Sumar 2 numeros");
		System.out.println("3.Salir");
	}
	
	
	
	public void menu() {
		displayOptions();
		options = entrada.nextShort();
		switch(options) {
		
		case 1:
			Random rm = new Random();
			rm.X();
			break;
			
		case 2:
			Addition At = new Addition();
			At.Ecuacion();
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default:
			System.out.println("La Opcion no es valida");
			break;
		
		
		}
		
	}
	
	
}
