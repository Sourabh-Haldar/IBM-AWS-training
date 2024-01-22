package com.ibm.CustomerOrder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.CustomerOrder.model.Order;
import com.ibm.CustomerOrder.model.Customer;

public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Order.class).addAnnotatedClass(Customer.class).buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {

			// create the objects
			/*
			 * Instructor tempInstructor = new Instructor("Chad", "Darby",
			 * "darby@luv2code.com");
			 * 
			 * InstructorDetail tempInstructorDetail = new InstructorDetail(
			 * "http://www.luv2code.com/youtube", "Luv 2 code!!!");
			 */

			

			Order tempOrder = new Order("efgh", "lunch",200,true);

			// associate the objects
			

			// start a transaction
			session.beginTransaction();

			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL
			//
			

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}