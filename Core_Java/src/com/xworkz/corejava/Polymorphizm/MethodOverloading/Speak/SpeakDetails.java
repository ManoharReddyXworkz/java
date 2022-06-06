package com.xworkz.corejava.Polymorphizm.MethodOverloading.Speak;

public class SpeakDetails {

	public static void main(String args[]) {
		
	  Speak sp = new Speak();
	  Friend friend = new Friend();
	  Unknown unknown = new Unknown();
	  sp.talk(friend);
	  sp.talk(unknown);
	  
	}
}
