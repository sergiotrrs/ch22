package com.oracle;

import java.util.HashSet;

public class HashSetConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ordenada
		 * No se permiten elementos duplicados.
		 * Cualquier elemento duplicado no se insertará.
		 */
		
		// Definimos una colección HashSet
		HashSet<String> paises = new HashSet<String>();
		
		// Agregamos valores a la colección con add()
		paises.add("México");
		paises.add("Alemania");
		paises.add("Genovia");
		paises.add("Wakanda");
		// Agregamos dato duplicado
		paises.add("Genovia");// este valor no se agrega
		
		System.out.println(paises);
		
		// Desplegamos el tamaño de la colección con size()
		System.out.println("N. de paises: " + paises.size() );
		
		// Verificado si un elemento existe en la colección.
		boolean paisExistente = paises.contains("Wakanda");
		System.out.println("Existe Wakanda: " + paisExistente );
		System.out.println("Existe Tlaxcala: " + paises.contains("Tlaxcala"));
		
		// Removemos un elemento
		paises.remove("Alemania");
		System.out.println(paises);
		
		// Iterar la colección.
		paises.forEach( pais -> System.out.println(pais) );
		
		for (String pais : paises) {
			System.out.println("Pais: " + pais);
		}

	}

}
