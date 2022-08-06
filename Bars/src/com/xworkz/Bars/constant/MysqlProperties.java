package com.xworkz.Bars.constant;

public enum MysqlProperties {
	URL("jdbc:mysql://Localhost:3306/bar"),
	USERNAME("root"),
	SECRET("s1820923");
	private String value;
	
	private MysqlProperties(String values) { 
		this.value= values;
	}
		public String getValues() {
			return value;
		
	
		}	

}
