package main;

import java.util.Scanner;

import ui.distanceForm;
import ui.timeForm;
import ui.velocityForm;

public class Ejer1 {
	Scanner entrada = new Scanner(System.in);
	
	public void displayOptions() {
			System.out.println("Bienvenido a esta calculadora para Movimientos Rectilineos Uniforme");
			System.out.println("Por favor seleccione alguna formula");
			System.out.println("1.Formula Distancia");
			System.out.println("2.Formula Velocidad");
			System.out.println("3.Formula Tiempo");
			System.out.println("4.Salir");
				
		}
		

	public void menu() {
		short option = 0;
			System.out.println();
			displayOptions();
			System.out.println();
			option = entrada.nextShort();
			switch (option) {
				case 1:
					distanceForm df = new distanceForm ();
					df.ecuacion();
					break;
				case 2:
				velocityForm vf = new velocityForm ();
				vf.ecuacion();
					break;
				case 3:
					timeForm tf = new timeForm();
					tf.ecuacion();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion no válida.");
					break;
			}
		
		
	}
	
		
		
		
	}
	
	
	
	

