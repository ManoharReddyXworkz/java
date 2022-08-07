package com.xworkz.bottel;

public enum Dbproperties {
	URL("jdbc:mysql://Localhost:3306"),
	USERNAME1("root"),
	PASSWORD("s1820923");
	
	
	
	private String values;
	
	private Dbproperties(String values){
		this.values= values;
	}
		public String getValues() {
			return values;
			
			
		}
	
}
