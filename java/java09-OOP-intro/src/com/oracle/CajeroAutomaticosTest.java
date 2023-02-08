package com.oracle;

public class CajeroAutomaticosTest {

	public static void main(String[] args) {
		
		//Utilizamos el atributo de clase
		System.out.println("Nombre Banco: " + CajeroAutomatico.nombreBanco);
		
		//Instanciamos la clase para crear objetos
		CajeroAutomatico suc10 = new CajeroAutomatico();
		CajeroAutomatico suc12 = new CajeroAutomatico();
		
		suc10.numSerie = 7854;
		suc10.ubicacion = "Costco Satélite";
		suc10.cantidadDisponible = 98_500.00;
		suc10.numMovimientos = 0;
		
		suc12.numSerie = 7812;
		suc12.ubicacion = "Plaza Las Américas";
		suc12.cantidadDisponible = 350_000.00;
		suc12.numMovimientos = 0;
		
		System.out.println("Cajero suc12, es del banco " + suc12.nombreBanco);
		// Lo recomnedado es cambiar los atributos de clase
		// utilizando la clase   
		// CajeroAutomatico.nombreBanco = "Paxtander";
		suc12.nombreBanco = "Paxtander";
		System.out.println("Cajero suc10, es del banco " + suc10.nombreBanco);
		System.out.println("Cajero suc12, es del banco " + suc12.nombreBanco);
		
		
	}

}