class AndOperator{

	public static void main(String args[]){
		int a,b,c;
		a=35; b=40; c=34;
		System.out.println(a<b && a>=c);
		System.out.println(a!=b && a>c);
		System.out.println(a>--b && a>=++c);
		System.out.println(a<--b && a-->=c);	
		System.out.println(a<++b && ++a>=c++);
		System.out.println("Value of A is:" + a);
		System.out.println("Value of B is:" + b);
		System.out.println("Value of C is:" + c);

		System.out.println(a == b && a!= c);	
		System.out.println(a == b && a == --c);	
		System.out.println("Value of A is:" + a);
		System.out.println("Value of B is:" + b);
		System.out.println("Value of C is:" + c);
		
		System.out.println(b!=a && a==c);	
		System.out.println(a==c-- && --a==--c);	//dought it should be true
		System.out.println("Value of A is:" + a);
		System.out.println("Value of B is:" + b);
		System.out.println("Value of C is:" + c);
		
	}
	
}
//System.out.println(++a == c && (a-=(b-4))); cant define int in boolean
//System.out.println(b<=c && a>c);	