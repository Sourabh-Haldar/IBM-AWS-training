package com.ibm.CustomerOrder.Service;

import com.ibm.CustomerOrder.Repository.OrderRepository;
import com.ibm.CustomerOrder.Repository.OrderRepositoryImpl;
import com.ibm.CustomerOrder.model.Order;
import com.ibm.CustomerOrder.Repository.*;
public class OrderServiceImpl implements OrderService{
private static OrderRepository orderRepository;
	
	static {
		orderRepository = new OrderRepositoryImpl();
	}
	@Override
	public Order insertOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.insertOrder(order);
	}

}
