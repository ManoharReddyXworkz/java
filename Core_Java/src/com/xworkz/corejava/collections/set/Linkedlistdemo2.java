package com.xworkz.corejava.collections.LinkedList;

import java.util.LinkedList;

public class Linkedlistdemo2 {
	public static void main(String[] args) {
	
		LinkedList<Car> ll = new LinkedList<Car>();
		Car audi = new Car();
		audi.setCompanyName("Audi");
		audi.setPrice(3200000);
		
		ll.add(audi);
		ll.add(null)
		

	}
	
	
}
