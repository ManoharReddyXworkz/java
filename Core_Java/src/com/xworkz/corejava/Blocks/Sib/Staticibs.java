package com.xworkz.corejava.Blocks.Sib;

public class Staticibs {

	String brand;
	String type;
	double price;
	String dimension;
	static String dthProvider;

	static { 
		System.out.println("I am SIB");
		dthProvider = "cabel";
	}

	Staticibs(){
		System.out.println("Hello this is constructor calling from Blocks (SBI)!!!");
	}

	{
	  this.brand ="LG";
	  this.type = "LED";
	  this.price = 2200000.55;
	  this.dimension = "24.5inch";
	  System.out.println("Hello this is IbiS");
	}
}
