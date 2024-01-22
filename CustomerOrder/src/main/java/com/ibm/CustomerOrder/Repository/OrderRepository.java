package com.ibm.CustomerOrder.Repository;

import com.ibm.CustomerOrder.model.Order;

public interface OrderRepository {
	Order insertOrder(Order order);
}
