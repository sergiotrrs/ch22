package com.banamex.cajero;

public class CajeroTest {

	public static void main(String[] args) {
		Cajero cajero001 = new Cajero(1, "Av. Siempre Viva", 325_000);
		Cajero cajero002 = new Cajero(2, "Av. Siempre Viva", 500_000);
		
		System.out.println(cajero001.informacion()); //numSerie = 1000
		System.out.println(cajero002.informacion()); //numSerie = 1001

		cajero001.numSerie = 800; //La clase no debe permitir esta modificación
		System.out.println(cajero001.informacion()); //numSerie = 800
		
		Cajero.contadorCajero = 0; //La clase no debe permitir esta modificación
		Cajero cajero003 = new Cajero(3, "Av. Siempre Viva", 1_000_000);//numSerie = 0
		System.out.println(cajero003.informacion()); //numSerie = 800
		
		System.out.println(Cajero.contadorCajero);
		
	}

}
