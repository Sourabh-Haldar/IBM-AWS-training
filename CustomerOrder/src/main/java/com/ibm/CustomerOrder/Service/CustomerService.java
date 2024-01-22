package com.ibm.CustomerOrder.Service;

import com.ibm.CustomerOrder.model.Customer;

public interface CustomerService {
	Customer insertCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(String customerId);
	Customer findByCustomerId(String customerId);
}
