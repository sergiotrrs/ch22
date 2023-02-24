package org.generation.app.service;


import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService implements IClienteService {

	@Autowired
	ICustomerRepository clienteRepository;  
		
	@Override
	public Customer getClienteById(long id) {
		//Solicitar de la DB
		//ToDo Sanitizar el dato entrada		
		return clienteRepository.findById(id);
	}

	@Override
	public Customer getClienteByEmail(String email) {
		//ToDo sanitizar los caracteres, que no se entregue !"#$%&/()
		return clienteRepository.findByEmail(email);
	}
	
	@Override
	public String setCliente(Customer customer) {
		Customer newCustomer = clienteRepository.save(customer);
		return "Cliente guardado con id " + newCustomer.getIdCustomer();
	}

}
