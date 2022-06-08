package com.xworkz.corejava.Inheritance.Hierarchical.Engineering;

public class HiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineering E = new Engineering();
		CsE cs = new CsE();
		CvE cv = new CvE();
		MeE me = new MeE();
		cs.branchname = "Computer Science";
		cv.branchname = "Civil";
		me.branchname = "Mechanical";
		System.out.println("The Branch is:" + cs.branchname);
		cs.developeSoftware();
		cs.research();
		cs.University();
		System.out.println();
		System.out.println("The Branch is:" + cv.branchname);
		cv.construction();
		cv.research();
		cv.University();
		System.out.println();
		System.out.println("The Branch is:" + me.branchname);
		me.assembel();
		me.research();
		me.University();
		
		
		
		
		
		
		
		
	}

}
