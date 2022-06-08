package com.xworkz.corejava.Inheritance.SimpleInheritance.Bike;

public class Bike {

		String type = "Bike";
		int nor = 2;
		String transition = "manual";
		
		void type() {
			System.out.println("Type of Vehicle: "+type);
		}
		void Rn() {
			System.out.println("Number Riders allowed: " + nor);
		}
		void transmission() {
			System.out.println("The Transimssion of Gear is:" + transition);
		}
}
