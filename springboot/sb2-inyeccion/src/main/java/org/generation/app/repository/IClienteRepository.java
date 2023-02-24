package org.generation.app.repository;

public interface IClienteRepository {
	
	public String saveCliente(String nombre);
	
	public String getClienteByEmail(String email);
	
	public String getClienteById(int id);
	
	public String getClienteByNombre(String nombre);
}
