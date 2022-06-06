class IncrDec{

	static public void main(String args[]){
	
		int n, a, b, c, d, v;
		n = 10; a = 20; c = 25; b = 30;
		b = b+1;
		d = a+c;// dought
		v = a++ + --b + c++ + d--;
		

		System.out.println("Value of B is : " + b);
		System.out.println("Value of D is : " + d);
		System.out.println("Value of V is : " + v);
		System.out.println("The Final Values are : " + b +" "+ " "+ a +" "+ c + " "+ d +" "+ n);
	}
}
