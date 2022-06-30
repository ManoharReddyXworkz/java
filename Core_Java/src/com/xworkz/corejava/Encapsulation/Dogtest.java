package com.xworkz.corejava.Encapsulation;

public class Dogtest {
	
public static void main(String[]args) {

	Dog dog = new Dog ();
dog.setName("goofy");
dog.setColor("Brown");
dog.setBreed("german");	
dog.setAge (20);
dog.setPrice(20000.00);
	
System.out.println("Name of the Dog is: "+dog.getName());
System.out.println("Breed of the Dog is: "+dog.getBreed());
System.out.println("Color of the Dog is: "+dog.getColor());
System.out.println("Age of the Dog is: "+dog.getAge());
System.out.println("Price of the Dog is: "+dog.getPrice());

}
}
