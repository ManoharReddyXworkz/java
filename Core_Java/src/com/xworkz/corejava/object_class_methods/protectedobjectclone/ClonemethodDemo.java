package com.xworkz.corejava.object_class_methods.protectedobjectclone;

public class ClonemethodDemo {

	public static void main(String[]args) throws CloneNotSupportedException {
		Soap santoor =new Soap ("Santoor",10.00,"Orange");
			Soap copyofSantoor=null;
			copyofSantoor = santoor.clone();
			
			System.out.println(copyofSantoor.equals(santoor));
			System.out.println("Santoor:"+ santoor);
			System.out.println("Santoor:"+ copyofSantoor);
	
			
		}	
}
