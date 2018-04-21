package org.com.collection;
import java.util.ArrayList;
import java.util.List;

public class OrderOperation {
	List<Order>list1;
	public OrderOperation(){
		list1=new ArrayList<Order>();
	}
	
	public void addOrder(Order order){
		list1.add(order);
		
	}
	public List<Order>getOrder(){
		return list1;
	}
	Order ord1;
	public Order SearchOrder(Order order){
		if(list1.contains(order)){
			ord1=order;
		}
		return ord1;
	}
	boolean status=false;
	public boolean RemoveOrder(Order order){
		if(list1.contains(order)){
			list1.remove(order);
			status=true;
			ord1=order;
		}
		return status;
	}
	

}
