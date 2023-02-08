package com.oracle;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección List es una colección ORDENADA, en la que se permiten
		 * elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su tamaño
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis:
		 *  ArrayList<object> varName;
		 */
		
		//Definimos una colección de tipo String.
		ArrayList<String> isbn = new ArrayList<>();
		ArrayList<String> nombreLibros = new ArrayList<>();
		
		//Agregar datos al arrayList con método add()
		nombreLibros.add("Caperucita Roja"); //El primer elemento es el índice 0
		nombreLibros.add("Harry Potter");
		nombreLibros.add("El señor de los anillos"); // índice 2
		nombreLibros.add("Quiúbole con...");
		
		//Desplegamos el tamaño de la colección, size()
		int sizeArrayList = nombreLibros.size();
		System.out.println("N. libros que recomienda Pax :" + sizeArrayList );
		
		//Mostramos el nombre del libro El seño de los anillos
		// usamos el método get().
		
		System.out.println("Pax recomienda: " + nombreLibros.get(2));
		
		//Removemos un libro del arrayList
		// utilizamos el método remove().
		
		System.out.println("Elemento eliminado: " + nombreLibros.remove(3)); //quiúbole con...
		
		nombreLibros.add("El extranjero");
		nombreLibros.add("Un mundo feliz");
		nombreLibros.add("El extranjero"); //elemento duplicado
		nombreLibros.add(3,"Los juegos del hambre"); //Agregamos en un índice determinado
		
		//Iteramos los elementos de la colección:
		for (int i = 0; i < nombreLibros.size() ; i++) {
			System.out.println("Regalamos a la Ch22: " + nombreLibros.get(i) );
		}
		
		//For mejorado
		for(String libro : nombreLibros ) {
			System.out.println("Para este 14 de feb. lee: " + libro );
		}
		
		//reemplazamos un elemento, método set().
		nombreLibros.set( 1 , "Nostalgia");
		
		// Iterar con forEach
		nombreLibros.forEach( libro-> System.out.println(libro) );
		
		//Se pasa la referencia, es necesario usar el método
		// clone() para que sean objetos independientes.
		ArrayList<String> clonLibros = nombreLibros;
		
		

	}

}
