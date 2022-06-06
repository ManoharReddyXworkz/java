import java.util.Scanner;
class SwitchDemo
{
	public static void main(String args[])
	{
	   
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Name of Number");
		String name = scn.nextLine(); //To provide String as input use nextLine 

		switch (name) {

		  case "Zero": System.out.println(0);
			    break;
		  case "One": System.out.println(1);
			    break;	
	          case "Two": System.out.println(2);
			    break;
		  case "Three": System.out.println(3);
			    break;
		  case "Four": System.out.println(4);
			    break;
		  case "Five": System.out.println(5);
			    break;
		  default: System.out.println("Invalid Number");
			  break; 
		} 
	}
}	
