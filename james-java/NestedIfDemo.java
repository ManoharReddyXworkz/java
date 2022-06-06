import java.util.Scanner;
class NestedIfDemo{

	public static void main(String args[]){

		int m;
		String usn,a,result,grade,exam;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The USN of the Student");
		usn = scn.nextLine();
		System.out.println("Enter The Attendence OF Student");
		a = scn.nextLine();
		System.out.println("Enter The Marks of the Student");
		m = scn.nextInt();

		if(m>85){
		grade = "A+";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Gold Medal"); 
		}
		if(m==85){
		grade = "A";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Distinction Passout"); 
		}
		if(m>=60 && m<85){
		grade = "B+";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: First Class");
		}
		if(m>=45 && m<60){
		grade = "B";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Second Class");
		}
		if(m>=35 && m==44){
		grade = "C";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Third Class");
		}
		if(m<35){
		grade = "F";
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Fail");
		}
	}
}