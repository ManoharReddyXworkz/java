package com.xworkz.corejava.String;

public class StringDemo {
public static void main(String []args) {
	
	String name = "Anil";
	String name1 = "Anil";
	
	System.out.println(name==name1);
	
	String vanitha = new String("vanitha");
	String internVanita = vanitha.intern();
	
	System.out.println(vanitha == internVanita);
	
	String vani = "Vanitha";
	
	System.out.println(internVanita == vani);
	
	name1= "bhoomika";
	
	System.out.println(name == name1);
	
	String vanitha1 =new String ("vanitha");
	
	System.out.println(vanitha == vanitha1);
	
}
}
