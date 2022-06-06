package com.xworkz.corejava.Polymorphizm.MethodOverloading.Speak;

public class Speak {

	void talk(Friend friend) {
		
		System.out.println("Hello, How are u doing");
	}
	void talk (Unknown unknown) {
		
		System.out.println("Hello, may I know your name");
	}
	
}
