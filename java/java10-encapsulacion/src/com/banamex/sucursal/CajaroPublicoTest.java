package com.banamex.sucursal;

import com.banamex.cajero.CajeroEncapsulado;

public class CajaroPublicoTest {

	public static void main(String[] args) {
		CajeroEncapsulado cajero001;
		cajero001 = new CajeroEncapsulado(1,"Plaza Antea",500_000);
		
		System.out.println( cajero001.informacion() );		
		cajero001.setUbicacion("Plaza Angelópolis");
		System.out.println( cajero001.informacion() );
		//cajero001.getNumeroSerie(); No se tiene acceso, por que no es público
			
	}
}
