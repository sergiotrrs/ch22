package com.banamex.banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesConceptos {

	public static void main(String[] args) /*excepciones*/ {
		/**
		 * Una excepción es una situación no esperada
		 * durante la ejecución de un programa.
		 * 
		 * Existen dos tipos de excepciones:
		 * 
		 * A)Checked Exceptions: Son excepciones que se heredan
		 * de la clase Exceptions. Se tiene que declar la excepción
		 * en la firma del método o bien, manejar la excepción con
		 * el bloque try-catch.
		 * 
		 * B)Unchecked Exceptions: Son excepciones que se heredan
		 * de clase RuntimeException. No se está obligado a procesarlas.
		 * Es opcional manejar con el bloque try-catch o declararlas
		 * en la firma del método.
		 * 
		 * Las excepciones de Error son arrojadas por la 
		 * JVM, son errores de los que no nos podemos recuperar.
		 * En cambio las de tipo Exception o RuntimeException
		 * son provocadas por nuestro código.
		 * 
		 * Manejo de excepciones con el bloque try-catch
		 * 
		 * sintaxis:
		 *   try{
		 *   
		 *   }
		 *   catch(excepción e){
		 *   
		 *   }
		 * 
		 * try: bloque de código que contendrá instrucciones que pudieran
		 *  generar una excepción.
		 * catch: se ejecutará si ocurre una excepción en el blque try.
		 * finally: bloque que se ejecutará después del bloque try o catch.
		 * 
		 * El stacktrace de una excepción es el conjunto
		 * de mensajes de excepciones desde el origen de la excepción hasta la
		 * última clase que recibe la exepción.
		 * 
		 */
		
		//Arithmetic exception
		System.out.println("Inicio del programa");
		double division;
		int[] myArray  = {3 , 5, 7};
		
		try {
			division = 5 / 1 ;			
			System.out.println(myArray[5]);
			
			File file = new File("myfile.txt");
			Scanner myReader = new Scanner( file );
						
		}
		catch(ArithmeticException e) {
			System.out.println("No se puede realizar la división entre cero");
			System.out.println(e);
		}
		catch(FileNotFoundException e) {
			System.out.println("El archivo no se enceuntra");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Algo pasó, llama a los bomberos");
			System.out.println(e);
		}
		finally {
			System.out.println("Fin del programa");
			
		}
		
		System.out.println("Fuera de try y catch");

	}

}
