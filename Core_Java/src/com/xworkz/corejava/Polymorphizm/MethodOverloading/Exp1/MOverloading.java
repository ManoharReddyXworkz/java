package com.xworkz.corejava.Polymorphizm.MethodOverloading.Exp1;

public class MOverloading {

	public static void main(String args[]) {
	
		Adder ad = new Adder();
		System.out.println(ad.add(10,7));
		System.out.println(ad.add(10.20f, 17.77f, 7.27f));
	}
}
