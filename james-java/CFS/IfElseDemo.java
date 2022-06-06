import java.util.Scanner;
class IfElseDemo{

	public static void main(String args[]){
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter obtained marks");
		int m = scn.nextInt();
		if(m>=35){
			System.out.println("You have passed in Exam");				
			} 
		else{
			System.out.println("You have Failed in Exam");
		    }

	}
}