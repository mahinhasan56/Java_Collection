package org.com.collection;


import java.util.List;
import java.util.Date;

public class OrderMain {
	public static void main(String[] args) {
		Order order1=new Order();
		Order order2 =new Order();
		Order order3 =new Order();
		order1.setId(1001);
		order1.setName("BOOK order");
		order1.setOrder_date(new Date(2016-1900,6,21));
		order2.setId(1002);
		order2.setName("BOOK order");
		order2.setOrder_date(new Date(2016-1900,2,21));
		order3.setId(1003);
		order3.setName("BOOK order");
		order3.setOrder_date(new Date(2016-1900,8,21));
		OrderOperation operation=new  OrderOperation();
		operation.addOrder(order1);
		operation.addOrder(order2);
		operation.addOrder(order3);
		List<Order>list1=operation.getOrder();
		System.out.print("order details");
		System.out.print("Id\tName\tDate");
		for (Order order:list1) {
			System.out.println(order.getId()+"\t"+ order.getName()+ 
					"\t"+order.getOrder_date());
		}
		System.out.println("Search Order");
		Order order4=new Order();
		Order ord1=operation.SearchOrder(order3);
		if (ord1 ==null) {
			System.out.println("Order not present");
		}else{
			System.out.println("Order found");
			System.out.println("Id\tName\tDate");
			System.out.println(ord1.getId()+"\t"+ ord1.getName()+ 
					"\t"+ord1.getOrder_date());
		}
		
		
		
		System.out.println("Remove Order");
		boolean status=operation.RemoveOrder(order1);
		
		
		if (status) {
			System.out.println("Order found and removed");
		}else{
			System.out.println("Order not found");
			
			System.out.print("order details");
			System.out.print("Id\tName\tDate");
			for (Order order:list1) {
				System.out.println(order.getId()+"\t"+ order.getName()+ 
						"\t"+order.getOrder_date());
			}
		
	}
	}
}


