package com.banamex.sucursal;

import java.util.ArrayList;

import com.banamex.banco.Banco;
import com.banamex.cajero.CajeroEncapsulado;

public class BancoTest {

	public static void main(String[] args) {
		
		Banco sucNorte = new Banco(10, "Calle norte n.8");
		
		ArrayList<CajeroEncapsulado> atms = new ArrayList<>();
		atms.add( new CajeroEncapsulado(1, sucNorte.getDireccion(), 500_000) );
		atms.add( new CajeroEncapsulado(2, sucNorte.getDireccion(), 1_000_000) );
		atms.add( new CajeroEncapsulado(3, sucNorte.getDireccion(), 2_000_000) );
		
		sucNorte.setCajeros(atms);
		System.out.println(sucNorte);
		
		//Agregamos nuevo monto al cajero
		CajeroEncapsulado cajeroModificado;
		
		//Objetemos el cajero1 del banco
		cajeroModificado = sucNorte.getCajeros() //Obtenmos la colección de cajeros
				.get(0); // de la colección, obtengo el índice 0 (cajero 1)
		
		cajeroModificado.setMontoDisponible(123_000);		
		System.out.println(sucNorte);
		cajeroModificado = null; //Para que esta variable no apunte a ningún objeto.

		//Recomendación
		sucNorte.getCajeros().get(0).setMontoDisponible(8_000_000);//Cambia el monto
		System.out.println(sucNorte);
		try {
			
			sucNorte.getCajeros().get(1).setMontoDisponible(-100); //cajero2
			System.out.println(sucNorte);
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("No se puede realizar la operación");
		}

		
				
		
		
	}

}
