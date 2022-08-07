package com.xworkz.corejava.collections.LinkedList;

public class Car {

	private String companyName;
	private double price;
	
	public Car() {
		
	}

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", price=" + price + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
