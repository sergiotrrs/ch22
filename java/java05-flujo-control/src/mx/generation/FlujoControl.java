package mx.generation;

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
		
		//if(condicion) System.out.println("La condición es verdadera");
		
		if(condicion) System.out.println("La variable condición fue true");
		else System.out.println("La variable condición fue false");
		
		int numeroEdoCuenta = 125668;
		
		if (numeroEdoCuenta < 1000) {
			System.out.println("El cliente es antiguo");
		} else {
			System.out.println("El cliente es nuevo");
		}
		
		
		
	}

}
