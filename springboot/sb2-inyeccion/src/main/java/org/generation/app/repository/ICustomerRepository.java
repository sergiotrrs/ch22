package org.generation.app.repository;

import org.generation.app.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
	
	Customer findById(long id);
	
	Customer findByEmail(String email);
		
}
