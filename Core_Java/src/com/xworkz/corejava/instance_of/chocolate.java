package com.xworkz.corejava.instance_of;

public class chocolate extends Sweet{

	
		void mouth(Sweet sweet){
			if(sweet instanceof Champakali) {
				System.out.println("Wow chocolate is mixed with champakalli sweet...!!");
			}
			else if(sweet instanceof KajjuBarfi) {
				System.out.println("Wow chocolate is mixed with KajuBarfi sweet...!!" );
			}
			else {
				System.out.println("I did't get any sweet.!!!");
			}

	}
}
