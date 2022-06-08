package com.xworkz.corejava.Inheritance.SimpleInheritance.Bike;

public class Tvs extends Bike {

	String company = "TVS";
	int speed = 150;
	int capacity = 160;
	
	void company() {
		System.out.println("The Name Of The Comapny is:" + company);
	}
	void topSpeed() {
		System.out.println("The Speed Of the Bike is:"+speed+"Kmph");
	}
	void cubic() {
		System.out.println("The Cubic Capacity of Bike is:"+capacity+"cc");
	}

}
