package com.ibm.CustomerOrder.Repository;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.CustomerOrder.MyFactory.MySessionFactory;
import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.model.Order;

public class OrderRepositoryImpl implements OrderRepository {
private static SessionFactory sessionFactory;
	
	private List<Order> orderList;
	
	static {
		try {
			sessionFactory = MySessionFactory.getSessionFactory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Override
	public Order insertOrder(Order order) {
		// TODO Auto-generated method stub
		String orderId=UUID.randomUUID().toString();
		String [] str=orderId.split("-");
		orderId=str[0];
		order.setId(orderId);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(order);
		session.getTransaction().commit();
		return order;
	}
	
}
