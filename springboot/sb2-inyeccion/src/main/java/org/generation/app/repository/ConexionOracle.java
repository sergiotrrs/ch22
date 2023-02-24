package org.generation.app.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ConexionOracle implements IClienteRepository {

	@Override
	public String saveCliente(String nombre) {
		
		return "Oracle registró " + nombre;
	}

	@Override
	public String getClienteByEmail(String email) {
		
		return "(Oracle) Te entrego los datos del cliente con email " + email;
	}

	@Override
	public String getClienteById(int id) {
		
		return  "(Oracle) Te entrego los datos del cliente con id " + id;
	}

	@Override
	public String getClienteByNombre(String nombre) {
		
		return  "(Oracle) Te entrego los datos del cliente con nombre " + nombre;
	}

}
