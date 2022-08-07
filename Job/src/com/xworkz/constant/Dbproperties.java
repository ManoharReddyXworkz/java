package com.xworkz.constant;

public enum Dbproperties {
URL("jdbc:mysql://Localhost:3306/job"),
USERNAME("root"),
SECRET("s1820923");
	private String value;
	Dbproperties(String value){
		this.value=value;
	
	}
	
	public String getvalue() {
		return "value";

		
	}
}
