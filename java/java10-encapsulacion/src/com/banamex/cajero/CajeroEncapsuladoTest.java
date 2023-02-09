package com.banamex.cajero;

public class CajeroEncapsuladoTest {

	public static void main(String[] args) {
		CajeroEncapsulado cajero001 = new CajeroEncapsulado(1, "Av. Siempre Viva", 325_000);
		CajeroEncapsulado cajero002 = new CajeroEncapsulado(2, "Av. Siempre Viva", 500_000);
		
		System.out.println(cajero001.informacion()); //numSerie = 1000
		System.out.println(cajero002.informacion()); //numSerie = 1001

		//cajero001.numSerie = 800; No se puede tener acceso por que está encapsulado
		//CajeroEncapsulado.contadorCajero = 0; No se puede tener acceso
		
		//Cajero001 Cambió de Ubicación, hay que ponerle otra ubicación.
		//cajero001.ubicacion = "Av. Saltilondon"; Está encapsulado, no se puede modificar
		cajero001.setUbicacion("Av. Saltilondon");
		System.out.println(cajero001.informacion());
		
		System.out.println("Valor contador: " + CajeroEncapsulado.getContadorCajero() );
		
	}

}
