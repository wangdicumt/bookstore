package cumt.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cumt.domain.Customer;
import cumt.mapper.CustomerMapper;
import cumt.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer login(String name, String password) {
		return customerMapper.find(name, password);
	}

	@Override
	public void register(Customer customer) {
		customerMapper.insertCustomer(customer);
	}

	@Override
	public Customer findPassword(String name, String qq) {
		Customer customer = customerMapper.findPassword(name, qq);
		return customer;
	}
		
	
}
