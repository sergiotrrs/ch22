package com.banamex.empleadotest;

import java.util.ArrayList;
import java.util.List;

import com.banamex.empleado.CajeroEmpleado;
import com.banamex.empleado.CajeroPriorityEmpleado;
import com.banamex.empleado.Empleado;

public class EmpleadoTest {

	public static void main(String[] args) {
	  Empleado pax = new Empleado("Páximo Décimo Meridio", "182598357", "MEDP170205R45");	  
	  System.out.println(pax);
	  
	  Empleado paxisSoto = new Empleado("Paxis Soto");	  
	  System.out.println(paxisSoto);
	  
	  System.out.println( pax.saludo() );
	  System.out.println( pax.saludo("Lic. En Ciencias Oscuras") );
	  System.out.println( pax.saludo("El español", true) );
	  
	  CajeroEmpleado ruben = new CajeroEmpleado("Rubén Sánchez");
	  System.out.println(ruben);
	  System.out.println(ruben.saludo("Dr. en Tiktok"));
	  
	  Empleado brayan = new CajeroEmpleado("Brayan Correa", 5);
	  System.out.println(brayan.toString());
	  System.out.println(brayan.saludo("Profesor"));
	  
	  Empleado jessica = new CajeroPriorityEmpleado("Jessica García");
	  jessica.setNumSeguroSocial("8952146");
	  jessica.setRfc("GAJES200101");
	  System.out.println(jessica);
	  System.out.println(jessica.saludo("Licenciada"));
	  
	  // Cambio el tipo de clase de una variable
	  System.out.println(brayan.saludo("Profesor"));
	  brayan = new CajeroPriorityEmpleado("Brayan Correa");
	  System.out.println(brayan.saludo("Profesor"));
	  
	  jessica = new CajeroEmpleado("Jessica García", 5);
	  System.out.println(jessica);
	  
	  
	  List< Empleado > listaEmpleados = new ArrayList<>();
	  listaEmpleados.add(jessica); // Empleado
	  listaEmpleados.add(brayan); // Empleado
	  listaEmpleados.add(ruben); // CajeroEmpleado
	  listaEmpleados.add(pax); // Empleado
	  
	  
	  //Empleado paxAcatempan = new Empleado();
	  //System.out.println(paxAcatempan);
	  

	}

}
