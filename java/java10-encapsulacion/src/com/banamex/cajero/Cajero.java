package com.banamex.cajero;

public class Cajero {
	int numSerie;
	String ubicacion;
	int numCajero;
	double montoDisponible;
	
	static int contadorCajero;
	
	static {
		contadorCajero = 1000;
	}
	
	Cajero(int numCajero , String ubicacion, double montoDisponible){
		this.numSerie = contadorCajero++;
		this.numCajero = numCajero;
		this.ubicacion = ubicacion;
		this.montoDisponible = montoDisponible;
	}
	
	String informacion() {
		//return "num Serie: " + this.numSerie +
		//return String.format("Serie: %s, Ubicación: %s", this.numSerie, this.ubicacion);
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Número de Serie: ");
		strBuilder.append(this.numSerie);
		strBuilder.append("\nNúmero de cajero: ");
		strBuilder.append(this.numCajero);
		strBuilder.append("\nUbicación: ");
		strBuilder.append(this.ubicacion);
		strBuilder.append("\nMonto Disponible: $");
		strBuilder.append(this.montoDisponible);
		strBuilder.append(" M.N. \n");
		
		return strBuilder.toString();			
	}
	
}
