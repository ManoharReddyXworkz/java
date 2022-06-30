package com.xworkz.corejava.object_class_methods.finalize_method;

class Biriyani {
	
	String name;
	double price;
	
   Biriyani(String name,double price){
	   this.name = name;
	   this.price =price;
   }
@Override
protected void finalize() throws Throwable {
	System.out.println("Finalize method is called");
}

@Override
public String toString() {
	return "Biriyani [name=" + name + ", price=" + price + "]";
}
   
   
   
}

