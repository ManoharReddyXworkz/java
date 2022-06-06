class Logical{

	public static void main(String args[]){
		int a, b;
		a= 10; b = 20;
		System.out.println((a>b) && (++a == b));
		System.out.println((a<b) || (a!= b) || ((a++)>b));
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
		System.out.println((a==b) || (a>b--)|| (--a<b));
		System.out.println((a!= b) && (a++ < b) && (a>b--));
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
	}
}