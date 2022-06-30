package com.xworkz.corejava.Thisandsuper;

public class Idly extends Food{

	String name ="Idly";
	String taste = "Good";
	String colour = "White";
	double  price=25.50;
	
	Idly(String name,String taste, String colour,double price ){
		
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
}
	
}
