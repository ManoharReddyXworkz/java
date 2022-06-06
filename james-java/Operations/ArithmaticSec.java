class ArithmaticSec{

	public static void main(String args[]){
			int a,b,c,d;
		a = 30; b = 25; c=17; d= 100;
		a+= c;               //a+ = c (correct form dont use a += c)
		c+= b;
		b+= a; 
		System.out.println("Value of A is: " + a);
		System.out.println("Value of B is: " + b);
		System.out.println("Value of C is: " + c);
	
		b-= a+c;
		a-= c;
		c-= b;
		d-=a+b+c;
		System.out.println("Value of A is: " + a);
		System.out.println("Value of B is: " + b);
		System.out.println("Value of C is: " + c);
		System.out.println("Value of D is: " + d);
			
		a*= c;
		b*= (-d);
		c*= a;
		d*= b;
		System.out.println("Value of A is: " + a);
		System.out.println("Value of B is: " + b);
		System.out.println("Value of C is: " + c);
		System.out.println("Value of D is: " + d);
	
		int x, y, z, s;
		x = 10; y = 20; z = 15; s = 25;
		x%= y;
		y%= z;
		z%= s;
		s%= x;
		System.out.println("Value of X is: " + x);
		System.out.println("Value of Y is: " + y);
		System.out.println("Value of Z is: " + z);
		System.out.println("Value of S is: " + s);

		x/= y;
		y/= z;
		z/= s;
		s/= x;
		System.out.println("Value of X is: " + x);
		System.out.println("Value of Y is: " + y);
		System.out.println("Value of Z is: " + z);
		System.out.println("Value of S is: " + s);	
		
	}
	
}