package com.xworkz.corejava.collections.set;


public class Student {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Student student) {
		if(this.id < student.id ) {
			return -1;
					
		}
		else if(this.id > student.id ) {
			return+1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
