package com.xworkz.corejava.Inheritance.Has_A_Realtionship.Library;

public class LsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		lib.student = new Student();
		lib.student.id = "1J17";
		lib.student.name = "Lucifer";
		lib.student.branch = "CSE";
		lib.name = "Sharadha";
		lib.location = "Banglore";
		lib.getdetails();//dought
		System.out.println("Library Name :"+lib.name);
		System.out.println("Library Location :"+lib.location);
		System.out.println("Student Id: "+ lib.student.id);
		System.out.println("Student Name: "+ lib.student.name);
		System.out.println("Student Branch: "+ lib.student.branch);
	}

}
