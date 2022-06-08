package com.xworkz.corejava.Inheritance.SimpleInheritance.Movie;

public class Bahuballi extends Movie {

	 String name = "Bahuballi";
	 int time = 3;
	 
	void name() {
		System.out.println("The Movie name is:" + name);
	}
	void Duration() {
		System.out.println("The Duration Of The Movie is:"+time+" hrs");
	}
}
