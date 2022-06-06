import java.util.Scanner;
class IfIfElseDemo{

	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Temp in your Locality");
		int temp = scn.nextInt();
		
		if(temp == 25){
	
		  System.out.println("Normal Weather Enjoy Your Day!");		
		}
		else if(temp>=50){
			System.out.println("Red Alert: Stay Inside Do not come out");
		}
		else if(temp>=35 && temp<45){
			System.out.println("Yello Alert: Avoid Sunlight Contact Directly(cover your self to avoid sun burns)");
		}
		else if(temp>=10 && temp <=15){
			System.out.println("Orange Alert: It's Too Cold outside Wear A Thick Coat Before Steping Out");
		}
		else{
			System.out.println("It is a Nice Monsoon Season Enjoy");
		    }
	}
}