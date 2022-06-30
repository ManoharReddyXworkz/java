package com.xworkz.corejava.Encapsulation;

public class Dog {
private String name ;
private String color;
private String breed;
private int age;
private double price;

Dog(){

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	if(age<25) {
	this.age = age;
	}
else {
	System.out.println("Invalid Data for age is entered");
}
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

}
