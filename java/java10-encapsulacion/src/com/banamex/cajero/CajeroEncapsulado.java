package com.banamex.cajero;

public class CajeroEncapsulado {
	private int numSerie; 
	private String ubicacion;
	private int numCajero;
	private double montoDisponible;
	
	private static int contadorCajero;
	
	static {
		contadorCajero = 1000;
	}
	
	public CajeroEncapsulado(int numCajero , String ubicacion, double montoDisponible){
		this.numSerie = contadorCajero++;
		this.numCajero = numCajero;
		this.ubicacion = ubicacion;
		this.montoDisponible = montoDisponible;
	}
	
	//Establecer métodos setters and getters.
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	//Establecemos solo el get de numSerie
	protected int getNumSerie() {
		return this.numSerie;
	}
	
	public static int getContadorCajero() {
		return contadorCajero;
	}
	
	public void setNumCajero(int numCajero) {
		this.numCajero = numCajero;
	}
	
	public int getNumCajero() {
		return this.numCajero;
	}
		
	public double getMontoDisponible() {
		return montoDisponible;
	}

	public void setMontoDisponible(double montoDisponible) {
		if(montoDisponible<0)
			throw new IllegalArgumentException("El monto no puede ser menor a cero");
		else
			this.montoDisponible = montoDisponible;
	}

	public String informacion() {
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
