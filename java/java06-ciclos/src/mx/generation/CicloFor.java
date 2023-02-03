package mx.generation;

public class CicloFor {

	public static void main(String[] args) {
		/**
		 * Sintaxis ciclo For
		 * 
		 *   for( expresión_inicial, comparación, expresión_final )
		 *   	instrucción;
		 *   
		 *   for( expresión_inicial, comparación, expresión_final ){
		 *   	instrucciones;
		 *   }
		 *   
		 */

		// imprimir la tabla de multiplicar del 1 al 3
		// 1 * 1 = 1
		// 1 * 10 = 10
		// 3 * 10 = 10
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				//System.out.println(i + " * " + j + " = " + (i*j));
				System.out.printf("%02d * %02d = %02d %n",i,j, i*j );
			}
		}
		
		int iteracion = 10;		
		for(  ;  ;  ) {
			if (iteracion<5) break;
			System.out.println("valor de iteración " + iteracion);
			iteracion--;
		}
		//Imprimir los números impares.
		for (int index = 0; index <= 20 ; index++) {
			if ( index % 2 == 0) continue;
			System.out.printf("El %02d es impar %n", index );			
		}
		
		
	}

}
