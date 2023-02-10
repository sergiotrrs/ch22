package com.banamex.empleado;

public class Empleado {
	private int id;
	private String nombre;
	private String numSeguroSocial;
	private String rfc;
	//private ArrayList<Roles>;
	
	private static int contadorEmpleado;
	
	{
		this.nombre = "Sin registrar";
		this.numSeguroSocial = "Sin registrar";
		this.rfc = "Sin registrar";
	}
	
	static {
		contadorEmpleado = 0;
	}

	private Empleado(){
		this.id = ++contadorEmpleado;
	}
	
	//Métodos sobrecargados (overloads)
	//Son métodos que tiene el mismo nombre, pero diferentes parámetros en la firma
	public Empleado(String nombre) {
		this();
		this.nombre = nombre.toUpperCase();		
		
	}
	
	public Empleado(String nombre, String numSeguroSocial, String rfc) {
		//La llamada a otro contructor debe ser en la primera línea.	
		this(nombre);   //this.nombre = nombre;
		                //this.id = ++contadorEmpleado;
		this.numSeguroSocial = numSeguroSocial;
		this.rfc = rfc;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumSeguroSocial() {
		return numSeguroSocial;
	}

	public void setNumSeguroSocial(String numSeguroSocial) {
		this.numSeguroSocial = numSeguroSocial;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getId() {
		return id;
	}

	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Empleado [id=");
		builder.append(id);
		builder.append("\n nombre=");
		builder.append(nombre);
		builder.append("\n numSeguroSocial=");
		builder.append(numSeguroSocial);
		builder.append("\n rfc=");
		builder.append(rfc);
		builder.append("]");
		return builder.toString();
	}
	

}
