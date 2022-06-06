import java.util.Scanner;
public class even
{
public static void main(String args[])
   {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scn.nextInt();
	if(num % 2 == 0)
	 	System.out.println(num + "is Even");
	   else
	  	System.out.println(num + "is Odd");
   }
}


