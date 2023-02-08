package com.oracle;

public class CajeroAutomaticoConstructorTest {

	public static void main(String[] args) {
		
		CajeroAutomatico caj11 = new CajeroAutomatico( "Plaza Patio");
		CajeroAutomatico caj13 = new CajeroAutomatico( "Av. Benito Juárez");
		CajeroAutomatico caj22 = new CajeroAutomatico( "Av. Siempre viva");
		CajeroAutomatico caj23 = new CajeroAutomatico( "Av. Reforma");
		CajeroAutomatico caj24 = new CajeroAutomatico( "Plaza Las Américas");
		//System.out.println(caj11.ubicacion);
		System.out.println( CajeroAutomatico.nombreBanco);
		
		System.out.println( caj11.imprimirDatosPlaca() );		
		System.out.println( caj23.imprimirDatosPlaca() );
		
		System.out.println("Cajeros creados : " + CajeroAutomatico.contadorCajeros);
		System.out.println("Precio dolar: " + CajeroAutomatico.valorDolar());
		
		

	}

}
