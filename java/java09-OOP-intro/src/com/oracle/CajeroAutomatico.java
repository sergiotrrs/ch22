package com.oracle;
public class CajeroAutomatico {
	//atributos de instancia
	int numSerie;
	String ubicacion;
	double cantidadDisponible;
	//BandejaDinero bandeja;
	int numMovimientos;
	
	//atributo de clase
	static String nombreBanco;
	static int contadorCajeros;
	
	//Inicialización de atributos de instancia
	{
		//numSerie = 0;
		//ubicacion = "desconocida";
		cantidadDisponible = 0.0;
		numMovimientos = 0;		
	}
	
	// Inicialización de atributos de clase
	static {
		nombreBanco = "PaxnaMex";
		contadorCajeros = 0;
	}
	
	// Métodos constructores
	// El método constructor no contiene el tipo de retorno.
	// Debe tener el mismo nombre de la clase
	// Un constructor vacío se le llama, método contructor por default.
	// Si usamos un constructor con parámetros, el contructor por default
	// ya no lo genera el compilador.
	CajeroAutomatico( String ubicacion){
		//numSerie = numSerieCajero;
		this.numSerie = ++contadorCajeros; 
		this.ubicacion = ubicacion;
		
		//System.out.println("Se crea un nuevo cajero");		
	}
	
	//Constructor por default
	CajeroAutomatico(){
		
	}
	
	//Método de clase
	static double valorDolar() {
		//ToDo obtener el valor del dolar
		// Un método estático no puede tener acceso a los atributos y método de instancia
		// ya que en el diseño de la clase, no existen objetos aún.
		// los objetos van a existir en la implementación de la clase.
		//int cantidad = this.cantidadDisponible;
		return 19.12;
	}
	
	//Métodos de instancia
	String imprimirDatosPlaca() {
		return this.numSerie + "\t"+ this.ubicacion + "\t" + this.cantidadDisponible;
	}

}

/*
public class CajeroAutomatico {
	//Fields, Non-static Fields (atributos de instancia)
	
	//Static fields (atributos de clase)
	
	//Bloque de inicialización de atributos de instancia
	
	//Bloque de inicialización de atributos de clase
	
	//Métodos constructores
	
	//Métodos de instancia
	
	//Métodos de clase (statics)

}*/
