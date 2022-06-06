import java.util.Scanner;
class Ternary{

	public static void main(String args[]){
	int age=21; 
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter Your Age");
	int result = scn.nextInt();
		String ans = age < result? "You are eligible to ride the Bike" :
					"You are under age to ride the Bike"; 
			
		System.out.println("Ternary of age is: " + ans);
	}
	
}
