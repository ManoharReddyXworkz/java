package com.xworkz.corejava.Constructor.constructor_chaining;

public class TataMotors extends TataGroups{
	
	
	String model;
	String color;
	
	TataMotors(){
		super("Niranjan");
		System.out.println("constructed TataMotors object");
		this.color = "red";
		this.model = "nexon";
	}
	

}
