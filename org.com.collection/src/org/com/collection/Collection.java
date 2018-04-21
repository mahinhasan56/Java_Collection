package org.com.collection;
import java.awt.List;
import java.util.ArrayList;

public class Collection{
	public static void main (String[]args){
		ArrayList list1=new ArrayList();
		list1.add(1245);
		list1.add("Hello");
		list1.add(new Integer(200));
		list1.add(new Employee());

		System.out.println(list1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println("using for loop");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(1));
		}
		for (Object object:list1){
			System.out.println(object);
			
		}
	}

	

}
