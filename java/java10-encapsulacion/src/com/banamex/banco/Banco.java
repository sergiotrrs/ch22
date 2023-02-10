package com.banamex.banco;

import java.util.ArrayList;
import com.banamex.cajero.CajeroEncapsulado;

public class Banco {
	private int numBanco;
	private int numEmpleados;
	private String direccion;
	private ArrayList<CajeroEncapsulado> cajeros;
	private static String nombreBanco;
	private static int contadorBanco;
	//private HashMap< id , Empleado >;
	
	static {
		nombreBanco = "PaxNorte";
		contadorBanco = 1;
	}
	
	{
		cajeros = new ArrayList<>();
	}
	
	public Banco(int numEmpleados, String direccion) {
		this.numBanco = contadorBanco++;
		this.numEmpleados = numEmpleados;
		this.direccion = direccion;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<CajeroEncapsulado> getCajeros() {
		return cajeros;
	}

	public void setCajeros(ArrayList<CajeroEncapsulado> cajeros) {
		this.cajeros = cajeros;
	}

	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		Banco.nombreBanco = nombreBanco;
	}

	public int getNumBanco() {
		return numBanco;
	}

	public static int getContadorBanco() {
		return contadorBanco;
	}

	@Override
	public String toString() {
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [numBanco=");
		builder.append(numBanco);
		builder.append("\nnumEmpleados=");
		builder.append(numEmpleados);
		builder.append("\ndireccion=");
		builder.append(direccion);
		builder.append("\ncajeros=");
		//builder.append(cajeros);
		
		for (CajeroEncapsulado cajero : cajeros) {
			builder.append(cajero.informacion());
		}
		
		builder.append("]\n");
		return builder.toString();
	}
	
	
	

}
