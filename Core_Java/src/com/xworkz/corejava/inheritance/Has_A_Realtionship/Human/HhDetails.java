package com.xworkz.corejava.Inheritance.Has_A_Realtionship.Human;

public class HhDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		h.heart = new Heart();
		 h.HairClr = "Black";
		 h.EyeColor = "Green";
		 h.Lang = "Kannada";
		 h.Location = "Hassan";
		 h.heart.bTimes = 72;
		 h.heart.color = "Red";
		 h.heart.pumpBlood();
		 h.heart.receiveBlood();
		 h.see(); // we cant use h.heart to access human class function
	     h.Dark();
	   
	     System.out.println("The Hair color is: "+h.HairClr);
	     System.out.println("The Eye color is: "+ h.EyeColor);
	     System.out.println("The Speak Language is: "+h.Lang );
	     System.out.println("The Locatiion is: "+ h.Location);
	     System.out.println("The Heart Beats per min is:"+ h.heart.bTimes+ "Pm");
	     System.out.println("The Color of Heart is: "+ h.heart.color);
	}

}

 