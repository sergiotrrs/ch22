package mx.generation;

public class FuncionesMain {

	public static void main(String[] args) {
		
		double valorA = solicitarNumeroConsola();
		double valorB = solicitarNumeroConsola();
		//double suma = sumaDouble(0.1, 0.2 );
		double suma = sumaDouble( valorA, valorB );		
		imprimir( formatoResultado(suma) );
								
		// En una función estática, solo podemos usar otras funciones estáticas
		imprimir( formatoResultado( sumaDouble(12.1, 34.213) ) );

	}
	
	// tipo_retorno nombre_función( parámetros ){ //firma de la función
	//
	// }
	static void imprimir( String texto ){ // con void indicamos que la función no tiene retorno
		System.out.println(" -> " + texto);
	}
	
	static String formatoResultado( double resultado ) { //retornamos un string
		                           //00.0000 son 6 dígitos
		String txt = String.format("Resultado %07.4f%n", resultado );
		return txt;
		//return String.format("Resultado %6.3f%n", resultado );
	}
	
	static double sumaDouble(double a, double b) {
		return ( (a*100)  +  (b*100) )/100.0;
	}
	
	static double solicitarNumeroConsola() {
		//ToDo solicitar número double en consola:
		// Filtros
		return 0.2;
	}
	

}
