package org.generation.app.service;

import org.generation.app.entity.Customer;

public interface IClienteService {
	
	public Customer getClienteById(long id);
	
	public Customer getClienteByEmail(String email);
	
	public String setCliente(Customer customer);

}
