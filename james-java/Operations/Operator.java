class Operator{
	
	public static void main(String args[]){
	
		int a, b, c, d, e;
		a = 10; b=20;
		c = --a + b++;
		d = a + --b;
		e = --a + --b;
		System.out.println("The value of C is : " + c);
		System.out.println("The value of D is : " + d);
		System.out.println("The value of A is : " + a);
		System.out.println("The value of B is : " + b);
	}
}