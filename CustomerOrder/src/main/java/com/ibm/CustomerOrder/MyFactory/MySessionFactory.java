package com.ibm.CustomerOrder.MyFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.model.Order;
public class MySessionFactory {
private static SessionFactory sessionFactory;
	
	static
	{
		try {
			sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Order.class).buildSessionFactory();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionFactory()throws Exception {
		return sessionFactory;
	}

}
