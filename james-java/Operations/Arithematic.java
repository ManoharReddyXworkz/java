class Arithematic{

	public static void main(String args[]){

		int a,b,sum,sub,prod,div,mod;
		a = 30; b = 25;
		sum = a+b;
		sub = a-b;
		prod = a*b;
		div = a/b;
		mod = a%b;

		System.out.println("Sum of a and b is: " + sum);
		System.out.println("Sub of a and b is: " + sub);
		System.out.println("Product of a and b is: " + prod);
		System.out.println("Division of a and b is: " + div);
		System.out.println("Modulus of a and b is: " + mod);
		
	}

}

		sum = ++a + b;
		sub = a-b;
		prod = a++*b;
		div = a/b;
		mod = a++%b;