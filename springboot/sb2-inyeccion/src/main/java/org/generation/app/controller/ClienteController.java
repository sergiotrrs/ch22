package org.generation.app.controller;

import org.generation.app.entity.Customer;
import org.generation.app.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired
	IClienteService clienteService;
	
	// Usando RequestParam
	@GetMapping() // localhost:8080/api/clientes?email=myemail@gmail.com
	public Customer getClienteByEmail(
			@RequestParam(name = "email", required = true) String email
			){
		return clienteService.getClienteByEmail(email);
	}
	
	
  // Usando Path Variable
	@GetMapping("{id}") //localhost:8080/api/clientes/2
	public Customer getClienteById(@PathVariable("id") int clienteId) {
		return clienteService.getClienteById(clienteId);
	}
	
	@PostMapping()
	public String setCliente(@RequestBody Customer customer) {		
		return clienteService.setCliente(customer);
	}

}
