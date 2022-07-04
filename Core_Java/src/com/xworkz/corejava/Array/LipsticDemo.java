package com.xworkz.corejava.Array;

public class LipsticDemo {

	public static void main(String[] args) {
		
		Lipstick lakme = new Lipstick ("Lakme","black",10.00);
		Lipstick mac = new Lipstick ("mac","pink",5.00);
		Lipstick myglamm = new Lipstick ("myglamme","green",1.00);
		Lipstick sugar = new Lipstick ("sugar","yellow",3.00);
		Lipstick maybeline = new Lipstick ("maybeline","red",350.00);
		Lipstick[] Lipsticks = {lakme, mac,myglamm, sugar,maybeline};
	for(int i= 0; i<Lipsticks.length;i++) {
		System.out.println(Lipsticks[i]);
	}
	}

}
