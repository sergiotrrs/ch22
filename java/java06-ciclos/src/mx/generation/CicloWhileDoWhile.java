package mx.generation;

import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {
		/**
		 * Ciclo While
		 * 
		 * Sintaxis:
		 *  Mientras la condición sea verdadera, se realiza el ciclo
		 * 	while(condición) instrucción;
		 * 
		 *  while(condición) {
		 *   instrucciones; 
		 *  }
		 *  
		 */

	boolean activo = true;
	boolean adeudos = false;
	Scanner sc = new Scanner(System.in);

	/*
	while( activo && !adeudos ) {
		System.out.println("\nBienvenido Sr. Potter");
		System.out.print("Quiere seguir activo (s/n)?");
		char respuesta = sc.nextLine().toLowerCase().charAt(0);
		if( respuesta != 's') activo = false;		
	}*/
	
	do{
		System.out.println("\nBienvenido Sr. Potter");
		System.out.print("Quiere seguir activo (s/n)?");
		char respuesta = sc.nextLine().toLowerCase().charAt(0);
		if( respuesta != 's') activo = false;		
	}while( activo && !adeudos );
	if (adeudos) System.out.println("Por favor, pase a pagar");
	System.out.println("Hasta pronto");
				
	
	//System.out.println("Comienza el ciclo, pulse c para continuar");
	//while( sc.nextLine().toLowerCase().charAt(0) == 'c'  ) /*instrucción*/ ;
	//System.out.println("Se terminó el ciclo");
	
	
	
	
	
	}	
}
