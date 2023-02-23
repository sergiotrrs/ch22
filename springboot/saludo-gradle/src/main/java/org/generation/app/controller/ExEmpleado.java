package org.generation.app.controller;


import org.generation.app.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExEmpleado {
	
	@Autowired
	Empleado empleado;
 
	@GetMapping("/exempleado") //localhost:8080/empleadodesmes
	public Empleado exEmpleado() {
		empleado.setId(8000);
		empleado.setNombre("Marimar");
		empleado.setPuesto("Costeñita soy");
		return empleado;
	}
	

	
}
