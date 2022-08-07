package com.xworkz.constant;

public enum Destignation {

	SOFTWAREDEVELOPER("softwaredeveloper"),
	SYSTEMENGINEER("systemengineer"),
	ASSOCIATEENGINEER("associateengineer"),
	DATABASEENGINNER("databaseenginner"),
	DEFAULT("default");
	
	private String destignation;
	private Destignation (String destignation) {
		this.destignation =destignation;
		
	}
	public String getdestignation() {
		return destignation;
	}
}
