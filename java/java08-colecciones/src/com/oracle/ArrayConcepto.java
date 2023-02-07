package com.oracle;

public class ArrayConcepto {

	public static void main(String[] args) {
		/**
		 * Los arreglos se difinen con corchetes []
		 * Los corchetes pueden ir antes o después de la variable
		 * ej.  int[] myArray; int myArray[];
		 * 
		 * Para los arreglos se debe asignar la cantidad de elementos que contendrá.
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		
		//Definimos un arreglo de 3 elementos tipo int.
		int[] codigoColores = new int[3]; // [  1  ; 2 ;  3 ]
		String[] nombreColores = new String[3]; //[ "color1" ; "color2" ; "color3" ];
		
		// Para agregar datos a un arreglo, indicamos dentro del corchete
		// el índice del dato. El priemer elemento es el índice 0.
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x00_00_ff; //RGB 0, 0, 255
		
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xff_ff_00; //RGB 255, 255, 0
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x00_00_00; //RGB 0, 0, 0
		
		//iteramos los datos de un arreglo.
		// con el atribulo length obtenemos el tamaño del arreglo
		for (int i = 0; i < nombreColores.length; i++) {
			System.out.printf("El color %s tiene el código RGB 0x%06X %n", 
					nombreColores[i], codigoColores[i]  );						
		}
		
		//nombreColores[5] = "verde"; Se crea la excepción que está fuera del límite
		
		//Podemos inicializar un arreglo al asignarlo a la variable
		// new Sting[4];
		String[] frutas = {"Naranja", "Uva", "Manzana", "Pitaya"};
		
		//Para indicar una matriz (dos dimensiones) en un arreglo
		// se indica con corchetes dobles [][].
		// primer corchete: filas.
		// segundo corchete: columnas.
		
		String[][] participantes = new String [3][5];
		
		//Agregar un elemento a la fila 2(indice 1), columna 4(indice 3).
		/**
		 *    [  ;  ;  ;       ;  ] //indice 0
		 *    [  ;  ;  ;  "Pax ;  ] //indice 1
		 *    [  ;  ;  ;       ;  ] //indice 2
		 */
		participantes[1][3] = "Pax";
		
		for (int i = 0; i < participantes.length; i++) {
			for (int j = 0; j < participantes[i].length; j++) {
				System.out.println("Mis mejores amigos son: " + participantes[i][j]);				
			}
			
		}
		
		
		

	}

}
