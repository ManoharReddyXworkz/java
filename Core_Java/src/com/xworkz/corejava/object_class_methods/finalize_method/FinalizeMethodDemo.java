package com.xworkz.corejava.object_class_methods.finalize_method;

public class FinalizeMethodDemo {

	public static void main(String args[]) {
		
		Biriyani biriyani = new Biriyani ("Hoskote",150.00);
	
		System.gc();
		
		System.out.println(biriyani);
	}
}
