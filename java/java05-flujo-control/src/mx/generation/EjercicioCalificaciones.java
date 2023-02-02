package mx.generation;

import java.util.Scanner;

public class EjercicioCalificaciones {

	public static void main(String[] args) {
		// 
		/**
		 * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
		 * El usuario proporcionará un valor entre 0 y 10 (usando Scanner). 
		 * Si está entre 9 y 10: imprimir una A 
		 * Si está entre 8 y menor a 9: imprimir una B 
		 * Si está entre 7 y menor a 8: imprimir una C 
		 * Si está entre 6 y menor a 7: imprimir una D 
		 * Si está entre 0 y menor a 6: imprimir una F 
		 * Cualquier otro valor debe imprimir: Valor desconocido.
		 */
		   Scanner sc = new Scanner(System.in);
	       System.out.print("Ingresa un numero de 0 a 10:");
	       int calificaciones = sc.nextInt();
	        
	      //Condicionales	        
	        if(calificaciones >= 9 && calificaciones <= 10) {
	            System.out.println("A");
	        }
	        else if(calificaciones >= 8 && calificaciones < 9 ) {
	            System.out.println("B");
	        }
	        else if(calificaciones >= 7 && calificaciones <8) {
	            System.out.println("C");
	        }
	        else if(calificaciones >= 6 && calificaciones <7) {
	            System.out.println("D");
	        }
	        else if(calificaciones >= 0 && calificaciones <6) {
	            System.out.println("F");
	        }
	        else{
	            System.out.println("Valor desconocido");
	        }

	       sc.close(); // Se cierra el recurso scanner
	}

}
