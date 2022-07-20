package com.xworkz.corejava.collections.arraylist.arraylistExamples;

public class Book {
	private String brandName;
	private int noOfPages;
	private double price;

	public Book() {

	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [brandName=" + brandName + ", noOfPages=" + noOfPages + ", price=" + price + "]";
	}


}

