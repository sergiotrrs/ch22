package org.generation.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.generation.app.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	
	@Autowired
	Empleado empleado;
 
	@GetMapping("/bienvenido") //localhost:8080/bienvenido
	public String saludo() {
		return "Hola Crayoli";
	}

	@GetMapping("/empleado-del-mes") //localhost:8080/empleadodesmes
	public Empleado empleadoDelMes() {
		//Empleado pax = new Empleado(1000, "Pax", "CEO de los CEOs"); 
		//return pax;
		//empleado = new Empleado();
		empleado.setId(1001);
		empleado.setNombre("Pax");
		empleado.setPuesto("Super CEO");
		return empleado;
	}
	
	@GetMapping("/empleados") // localhost:8080/empleados?id=2
	public Empleado getEmpleadoById(@RequestParam int id) {
		Map<Integer, Empleado> empleados = new HashMap<>();
		
		
		empleados.put(1,  new Empleado(1, "Juan Verdadero", "Sr. Databases"));
		empleados.put(2, new Empleado(2, "Juan Falso", "Sr. Databases"));
		empleados.put(3, new Empleado(3, "Pavel", "Sr. de los Anillos"));
		empleados.put(4, new Empleado(4, "Alan", "Jr. Nivel Sayajin"));
		
		if (empleados.containsKey(id) )
			empleado = empleados.get(id);
		else 
			empleado = null;
		
		return empleado;
	}
	
	
	
	//@GetMapping("/empleados") //localhost:8080/empleados
	public List<Empleado> empleados() { 
		List<Empleado> empleados = new ArrayList<>();
		empleados.add( new Empleado(1, "Juan Verdadero", "Sr. Databases"));
		empleados.add( new Empleado(2, "Juan Falso", "Sr. Databases"));
		empleados.add( new Empleado(3, "Pavel", "Sr. de los Anillos"));
		empleados.add( new Empleado(3, "Alan", "Jr. Nivel Sayajin"));
		
		return empleados;
	}
	
}
