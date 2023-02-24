package org.generation.app.service;


import org.generation.app.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	IClienteRepository clienteRepository;  
		
	@Override
	public String getClienteById(int id) {
		//Solicitar de la DB
		//ToDo Sanitizar el dato entrada		
		return clienteRepository.getClienteById(id);
	}

	@Override
	public String getClienteByEmail(String email) {
		//ToDo sanitizar los caracteres, que no se entregue !"#$%&/()
		return clienteRepository.getClienteByEmail(email);
	}

}
