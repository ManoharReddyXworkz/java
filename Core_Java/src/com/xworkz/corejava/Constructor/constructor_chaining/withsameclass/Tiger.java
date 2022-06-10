package com.xworkz.corejava.Constructor.constructor_chaining.withsameclass;

public class Tiger {
	String name;
	String color;
	String gender;
	
	Tiger(){
		this("Leo","White","Female");
	
	}

	Tiger(String name,String clr){
	this.name = name;
	this.color = clr;
	System.out.println("Hello Tiger had dinner..!");
	}
	Tiger(String name, String clr, String gender){
	this("Rio","Orange"); //call to Tiger (String name, String clr)	
	this.name=name;
	}


}
