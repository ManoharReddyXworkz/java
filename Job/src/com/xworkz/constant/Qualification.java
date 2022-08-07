package com.xworkz.constant;

public enum Qualification {
	
	BE("BE"),BCA("BCA"),BSC("BSC"),DEFAULT("Diploma");

	private String education;

	private Qualification(String education) {
		this.education = education;
	}

	public String getQualification() {
		return education;

	}

}