package com.ibm.CustomerOrder;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.CustomerOrder.Repository.OrderRepository;
import com.ibm.CustomerOrder.Repository.OrderRepositoryImpl;
import com.ibm.CustomerOrder.Service.CustomerService;
import com.ibm.CustomerOrder.Service.CustomerServiceImpl;
import com.ibm.CustomerOrder.Service.OrderService;
import com.ibm.CustomerOrder.Service.OrderServiceImpl;
import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.model.Order;

/**
 * Hello world!
 *
 */
public class App 
{
private static CustomerService customerService;
    
	static {
		customerService = new CustomerServiceImpl();
	}
private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
    public static void main( String[] args )
    {
    	/*Order order = new Order(); 
    	String orderId = UUID.randomUUID().toString();
		 String [] str = orderId.split("-"); orderId = str[0];
		 order.setId(orderId); order.setType("Garments");
		order.setPrice(10087.25); order.setIsConfirmed(true);
		Customer customer = new Customer();
		customer.setId(orderId);
		customer.setName("Ankur");
		 // customerService.insertCustomer(customer);
		  customer.setId(orderId);
			customer.setName("Sourabh");
			//customerService.insertCustomer(customer);
		 */
    	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Order.class).buildSessionFactory();
    	
		  
		 
    }
}
