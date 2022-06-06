package com.xworkz.corejava.Polymorphizm.MethodOverloading.Exp2;

public class MOverloading {
	
	public static void main(String args[]) {
		
		AddSub as = new AddSub();
		 System.out.println("The Sum of a&b is: "+ as.add(10, 7));
		 System.out.println("The Sum of a&b is: "+ as.add(7, 17, 77));
	}

}
