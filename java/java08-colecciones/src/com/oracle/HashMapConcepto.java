package com.oracle;

import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relación de llave(key)-valor
		 * que forma una especie de tabla de datos
		 */
		
		//Definimos una colección hashmap
		//        < key , value >
		HashMap< Integer, String > estudiantes = new HashMap<>();
		
		//Agregamos valores a la colección.
		estudiantes.put( 1259 , "Juan Verdadero" );
		estudiantes.put( 2569 , "Juan Falso" );
		estudiantes.put( 2570 , "Juan Falso" );
		estudiantes.put( 5892 , "Rafael Encinas" );
		estudiantes.put( 8592 , "Luis Soto de otro universo" );
		estudiantes.put( 8592 , "Luis Soto de nuestro universo" );//Sustituye el anterior dato
		
		System.out.println(estudiantes);
		
		//Mostramos el dato de la llave indicada con get()
		System.out.println("Mi nuevo mejor amigo es: " + estudiantes.get(1259));
		
		// Removemos un elemento de la colección
		estudiantes.remove( 5892 );
		System.out.println(estudiantes);
		
		// Iteramos los elementos de la colección
		// Iterar sus claves con keySet()
		for (int matricula : estudiantes.keySet() ) {
			System.out.println("Matrícula: "+ matricula + " - "+ estudiantes.get(matricula));
		}
		//Iter sus valores con values()
		for (String estudiante : estudiantes.values() ) {
			System.out.println("Estudiante: " + estudiante);
		}
		
		//Verificar si existe un valor con containsValue()
		if ( estudiantes.containsValue("Luis Soto de nuestro universo") )
			System.out.println("Me siento tranquilo");
		else
			System.out.println("Se ha ido a otra cohorte");

	}

}
