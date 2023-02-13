package com.banamex.empleado;

public class CajeroPriorityEmpleado extends CajeroEmpleado {
	
	public CajeroPriorityEmpleado(String nombre) {
		super(nombre, 1);
		
	}
	
	@Override
	public String saludo(String titulo) {
		return "Soy su asistente priority  " + titulo + " " + super.getNombre();
	}
	

}
