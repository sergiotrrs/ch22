package org.generation.saludo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.saludo.entity.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
 
	@GetMapping("/bienvenido") //localhost:8080/bienvenido
	public String saludo() {
		return "Hola Crayoli";
	}

	@GetMapping("/empleado-del-mes") //localhost:8080/empleadodesmes
	public Empleado empleadoDelMes() {
		Empleado pax = new Empleado(1000, "Pax", "CEO de los CEOs"); 
		return pax;
	}
	
	@GetMapping("/empleados") //localhost:8080/empleados
	public List<Empleado> empleados() { 
		List<Empleado> empleados = new ArrayList<>();
		empleados.add( new Empleado(1, "Juan Verdadero", "Sr. Databases"));
		empleados.add( new Empleado(2, "Juan Falso", "Sr. Databases"));
		empleados.add( new Empleado(3, "Pavel", "Sr. de los Anillos"));
		empleados.add( new Empleado(3, "Alan", "Jr. Nivel Sayajin"));
		
		return empleados;
	}
	
}
