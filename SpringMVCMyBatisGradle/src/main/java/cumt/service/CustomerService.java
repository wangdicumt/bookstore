package cumt.service;

import cumt.domain.Customer;

public interface CustomerService {
	
	Customer login( String name, String password);
	
	void register(Customer customer);
	
	Customer findPassword(String name, String qq);
}
