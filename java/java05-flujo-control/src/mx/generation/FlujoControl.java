package mx.generation;

import java.util.Scanner;

public class FlujoControl {
	
	public static void main(String[] args) {
		/**
		 * Sintaxis de la condicional if
		 * 
		 *  if(condición) instrucción_si_condición_es_true;
		 *  
		 *           --------------------
		 *  if(condición){
		 *    Instrucciones si la codsición es true;
		 *  
		 *  }
		 *  
		 *           --------------------
		 *    
		 *  if(condición){
		 *    Instrucciones si la condición es true;
		 *  
		 *  }else {
		 *    Instrucciones si la condición es false
		 *  }
		 *  
		 *           --------------------
		 *           
		 *  if(condición){
		 *    Instrucciones si la condición es true;
		 *  
		 *  }else if (nueva_condición) {
		 *    Instrucciones si la nueva_condición es true;
		 *    
		 *  }else{
		 *    Instrucciones si las anteriores condiciones son false;
		 *    
		 *  }		   
		 *  
		 * 
		 */
		
		boolean condicion = false;
		
		System.out.println("Java 05");
		
		// if(condicion) System.out.println("La condición es verdadera");
		
		if(condicion) System.out.println("La variable condición fue true");
		else System.out.println("La variable condición fue false");
		
		int numeroEdoCuenta = 125668;
		
		if (numeroEdoCuenta < 1000) {
			System.out.println("El cliente es antiguo");
		} else {
			System.out.println("El cliente es nuevo");
		}
		
		// De una variable tipo int., se evalue si está en
		// el rango de 1 a 10, si es así desplegar en consola
		// "La selección está en rango",
		// caso contrario "La selección está fuera de rango
		
		int numero = 10;
		if (numero > 0 && numero < 11) 
			System.out.println("El numero está entre 1 y 10");			
		else 
			System.out.println("No está en el rango");
		
		//Segunda versión
		if( numero >= 1 && numero <= 10 ) {
			System.out.println("La seleccion esta en rango");
		}
		else {
			System.out.println("La seleccion esta fuera de rango");
		}

		// Operador ternario 
		// sintaxis:   expresion ? respuesta_si_es_true : si_es_false ;
		// Es un condicional simplificado.		
		String respuesta = (numero >= 1 && numero <= 10) ?
				"La selección está en rango" :
				"La selección está fuera de rango";
		System.out.println(respuesta);
		
		// Clase Scanner.
		// La clase scanner nos permite realizar una lectura de la consola
		// Para utilizar la clase scanner hay que importar la clase del
		// paquete java.util
		int myAge = 0;
		String buffer = "";
		Scanner sc = new Scanner( System.in );
		System.out.print("Escribe tu nombre: ");
		String myName = sc.nextLine(); // Leer un string hasta que se encuentre /n
		
		System.out.print("Dime tu edad: ");
		if ( sc.hasNextInt() ) {	//Lo que está en el buffer es un dato de tipo int
		  myAge = sc.nextInt(); //Leer un dato de tipo int.
		  sc.nextLine(); //consume \n
		}
		else
		   buffer = sc.nextLine();	// Leemos lo que esté en el buffer				
				
		System.out.print("Dime tu apellido ");
		String myLastname = sc.nextLine();
		
		System.out.println("Holi " + myName + " de edad " + myAge + "años");
		System.out.println("Con apellido: " + myLastname);
		//System.out.println("Datos en buffer: " + buffer);		
		
	}

}
