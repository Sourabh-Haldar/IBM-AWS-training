package com.ibm.CustomerOrder.Repository;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.MyFactory.MySessionFactory;
public class CustomerRepositoryImpl implements CustomerRepository {
	private static SessionFactory sessionFactory;
	
	private List<Customer> customerList;
	
	static {
		try {
			sessionFactory = MySessionFactory.getSessionFactory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String customerId=UUID.randomUUID().toString();
		String [] str=customerId.split("-");
		customerId=str[0];
		customer.setId(customerId);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(customer);
		session.getTransaction().commit();
		return customer;
		
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.merge(customer);
		session.getTransaction().commit();
		return customer;
	}
	@Override
	public void deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		Customer customer1 = findByCustomerId(customerId);
		if(customer1 == null)
			System.out.println("Customer not found");
		else {
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.delete(customer1);
			session.getTransaction().commit();
			System.out.println("Customer deleted: " + customer1);
		}
	}
	@Override
	public Customer findByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Customer customer=session.find(Customer.class, customerId);
		return customer;
	}
	
}
