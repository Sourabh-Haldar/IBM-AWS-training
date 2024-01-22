package com.ibm.CustomerOrder.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

	@Id
	@Column(name = "orderId")
	private String id;
	@Column(name = "OrderType")
	private String Type;
	@Column(name = "OrderPrice")
	private double Price;
	@Column(name = "isConfirmed")
	private Boolean isConfirmed;

	public Order(String string, String string2, int i, boolean b) {
		// TODO Auto-generated constructor stub
		this.id = string;
		this.Type = string2;
		this.Price = i;
		this.isConfirmed = b;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
