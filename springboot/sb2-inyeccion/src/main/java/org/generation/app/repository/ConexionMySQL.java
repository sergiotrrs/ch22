package org.generation.app.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ConexionMySQL implements IClienteRepository {

	@Override
	public String saveCliente(String nombre) {
		
		return "MySQL registró " + nombre;
	}

	@Override
	public String getClienteByEmail(String email) {
		
		return "(MySQL) Te entrego los datos del cliente con email " + email;
	}

	@Override
	public String getClienteById(int id) {
		
		return  "(MySQL) Te entrego los datos del cliente con id " + id;
	}

	@Override
	public String getClienteByNombre(String nombre) {
		
		return  "(MySQL) Te entrego los datos del cliente con nombre " + nombre;
	}

}
