package com.oracle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Zoologico {

	public static void main(String[] args) {
	 String[] animales = {
			 "panda",
			 "caballo",
			 "gorila",
			 "cocodrilo",
			 "cocodrilo",
			 "panda",
			 "zopilote",
			 "Urraca",
			 "León"			 
	 };
	 
	 /*
	 HashSet<String> especies = new HashSet<String>();		 
	 for (String animal : animales) {
		 especies.add(animal);
	 }*/
	 
	 HashSet<String> especies = new HashSet<String>( Arrays.asList(animales) );
	 
	 System.out.println("Total animales: " + animales.length );//9
	 System.out.println("Total especies: " + especies.size() );//7

	 //Listar la especie y el número de animales que lo contiene
	 /**
	  *  panda 2
	  *  caballo 1
	  *  gorila 1
	  *  cocodrilo 2
	  */
	 HashMap <String, Integer> especiesCantidad = new HashMap<>();
	 
	 int cantidad;
	 for (String animal : animales) {
		if (especiesCantidad.containsKey(animal)) {
			cantidad = especiesCantidad.get(animal) + 1; 
			especiesCantidad.put(animal, cantidad );
		}
		else
			especiesCantidad.put(animal, 1 );
	 }
	 
	 for (String animal : especiesCantidad.keySet() )
		 System.out.println( especiesCantidad.get(animal)+ " " + animal);
	 	 
	}
}
