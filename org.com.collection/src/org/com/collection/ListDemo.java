package org.com.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListDemo {
	public static void main (String[]args){
		List<String>city=new ArrayList<String>(); 
			
		city.add("Dhaka");
		city.add("Khulana");
		city.add("Chittagong");
		city.add("Rahgshgj");
		city.add("sylhet");
		System.out.println(city);
		city.remove(2);
		city.remove("Sylhet");
		if(city.contains("Dhaka")){
			System.out.println("Element Present");
		}
		else{
			System.out.println("Element Not Present");
		}
		
	}

}
