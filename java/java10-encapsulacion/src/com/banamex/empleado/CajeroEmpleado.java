package com.banamex.empleado;
// Para aplicar la herencia, en la firma de la clase
// se agrega la palabra extends y se indica la clase padre(clase superior).
// Solo se puede heredar de una clase.
public class CajeroEmpleado extends Empleado {
    private int cajaAsignada; 
	
	public CajeroEmpleado(String nombre) {
		// super apunta a la clase superior, solo se puede invocar
		// a un constructor de la clase padre o de la misma clase
		super(nombre);				
	}
	
	public CajeroEmpleado(String nombre, int cajaAsignada ) {
		this(nombre);
		this.cajaAsignada = cajaAsignada;
	}

	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCajeroEmpleado [cajaAsignada=");
		builder.append(cajaAsignada);
		builder.append("\n toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}*/
	
	
	
	// Sobre escritura de métodos(overriding);
	// La clase hija sobre escribe un método de la clase padre
	// para que exista la sobreescritura, debe contener el mismo nombre
	// los mismos parámetros y el retorno debe ser un tipo compatible
	// @Override, verifica la existencia del método en la clase padre
	
	@Override
	public String toString() {		
		return super.toString() + "\n caja asignada=" + this.cajaAsignada;
	}
	

}
