class OrOperator{

	public static void main(String args[]){
			
		int s,u,v;
		s = 10; u = 17; v = 7;
		System.out.println((s>v--) || (v++>s) || (u>s));
		System.out.println((s<v--) || (v++>u) || (u>s));
		System.out.println((s==v) || (v!=++s) || (u<s));
		System.out.println((s+=v)== u || (v--<s) || (u!=s));
		System.out.println("Value of S is: " + s);
		System.out.println("Value of U is: " + u);
		System.out.println("Value of V is: " + v);
	}
	
}