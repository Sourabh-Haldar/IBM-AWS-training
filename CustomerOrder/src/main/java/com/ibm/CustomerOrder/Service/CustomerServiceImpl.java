package com.ibm.CustomerOrder.Service;

import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.Repository.*;

public class CustomerServiceImpl implements CustomerService{
private static CustomerRepository customerRepository;
	
	static {
		customerRepository = new CustomerRepositoryImpl();
	}
	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerRepository.insertCustomer(customer);
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomer(customer);
	}
	@Override
	public void deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteCustomer(customerId);
	}
	@Override
	public Customer findByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerId(customerId);
	}
	
}
