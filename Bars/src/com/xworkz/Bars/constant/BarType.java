package com.xworkz.Bars.constant;

public enum BarType {
	

	WINE("wine_Store"),
	MSIL("Msil"),
	BAR_RESTURANT("Bar And Resturant"),
	PUB("Pubs"),
	RESORT("Resort"),
	DEFAULT("Resturant");

	private String type;

	private BarType(String type) {
		this.type = type;

	}
	public String getBar() {
		return type;

	}
		
}
