package com.xworkz.corejava.object_class_methods.equals;

public class EqualsMethodDemo {
public static void main(String[]args) {
	
	Ac lg = new Ac("Lg","White",30000.00);
	Ac Samsang = new Ac("Samsung","Black",35000.00);
	Ac lg1 = new Ac("Lg","White",30000.00);
	
	System.out.println(lg.equals(lg1));
}
}
