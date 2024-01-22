package com.ibm.CustomerOrder.Repository;
import com.ibm.CustomerOrder.model.Customer;
public interface CustomerRepository {
	Customer insertCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(String customerId);
	Customer findByCustomerId(String customerId);
}
