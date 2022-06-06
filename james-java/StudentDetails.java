class StudentDetails{

	public static void main(String args[])
	{
	   Student s = new Student();
	   s.usn = "1JT14IS044";
	   s.name = "Sharath";
	   s.age = 26;
	   s.dob = "01-11-1996";
	   s.gender = "male";
	

	   Student d = new Student();
	   d.usn = "1JT14IS047";
	   d.name = "Shadow";
	   d.age = 26;
	   d.dob = "11-04-1997";
	   d.gender = "male";
	   

	  Student b = new Student();
	   b.usn = "1JT14CS058";
	   b.name = "Venu";
	   b.age = 26;
	   b.dob = "28-01-1996";
	   b.gender = "male";


	   Student m = new Student();
	   m.usn = "1JT14IS045";
	   m.name = "Srinidhi";
	   m.age = 26;
	   m.dob = "02-09-1996";
	   m.gender = "male";
	
	   
	   Student r = new Student();
	   r.usn = "1JT14CS039";
	   r.name = "Priyanka";
	   r.age = 26;
	   r.dob = "05-11-1996";
	   r.gender = "Female";
	
	   System.out.println("Student 1");	
	   r.Printdetails();
	   System.out.println("Student 2");
	   m.Printdetails();
	   System.out.println("Student 3");
	   b.Printdetails();
 	   System.out.println("Student 4");
 	   s.Printdetails();	
 	   System.out.println("Student 5");	
	   d.Printdetails();
	}
}