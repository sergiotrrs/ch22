package org.generation.app.entity;

public class Empleado {
	private Integer id;
	private String nombre;
	private String puesto;
	
	public Empleado(Integer id, String nombre, String puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	

}
