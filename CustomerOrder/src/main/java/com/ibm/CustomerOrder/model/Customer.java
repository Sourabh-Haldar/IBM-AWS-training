package com.ibm.CustomerOrder.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private String id;
	@Column(name = "customer_name")
	private String name;
		
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL )
	private List<Order> order;

}
