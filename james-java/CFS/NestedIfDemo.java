import java.util.Scanner;
class NestedIfDemo{

	public static void main(String args[]){

		int m;
		String usn,grade;				
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The USN of the Student");
		usn = scn.nextLine();
		System.out.println("Enter The Grade OF Student");
                grade = scn.nextLine();
		System.out.println("Enter The Marks of the Student");
		m = scn.nextInt();

		if(m>85){
		System.out.println("USN of the Student: " + usn);
		System.out.println("Grade of the Student: " + grade);
		System.out.println("Rank of the Student: Gold Medal"); 
		}
		if(grade.equals("A")){
		System.out.println("Hello: Welcome To Gamers Collage!!");
		System.out.println("Click The Below Link: To Know the Courses!!" );
		System.out.println("Thnak You!");
		}
		if(!(grade.equals("A"))){
		System.out.println("Welcome To the Tournment!!");
		System.out.println("Click The Below Link To Enroll");
		System.out.println("Have Fun!!!!");
		}
		
	}
}