package org.com.collection;

import java.util.Date;

public class Order {
	private int id;

	private String name;
	private Date Order_date;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Date getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(Date order_date) {
		Order_date = order_date;
	}
	
}
