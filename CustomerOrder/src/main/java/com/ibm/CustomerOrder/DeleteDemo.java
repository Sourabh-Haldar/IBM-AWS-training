package com.ibm.CustomerOrder;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.CustomerOrder.model.Customer;
import com.ibm.CustomerOrder.model.Order;

public class DeleteDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Order.class)
				.addAnnotatedClass(Customer.class).buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get instructor by primary key / id
			System.out.println("Enter id: ");
			String id=sc.next();
			Customer tempCustomer = session.get(Customer.class, id);

			System.out.println("Found instructor: " + tempCustomer);

			// delete the instructors
			if (tempCustomer != null) {

				System.out.println("Deleting: " + tempCustomer);

				// Note: will ALSO delete associated "details" object
				// because of CascadeType.ALL
				//
				session.delete(tempCustomer);
			}

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
