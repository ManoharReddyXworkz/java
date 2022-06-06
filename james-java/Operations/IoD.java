class IoD{

	public static void main(String args[]){

		int a, b, c, d, f, s;
		a=10; b=11; s=7; d=77; f=0; c=17;

		a = ((--b) + (++c)); // 10+18 = 28 = a

		d = ((f++) + (--c)); // 0+17 = 17 = d

		f = ((f) + (s++)); // 1+7 = 8 = f

		c = ((++a) - (d)); // 29-17 = 11

		b = ((s++) - (++d)); // 8-18 = -10

		System.out.println("value of A is :" + a); 
		System.out.println("value of B is :" + b);
		System.out.println("value of C is :" + c);
		System.out.println("value of D is :" + d);
		System.out.println("value of F is :" + f);
		System.out.println("value of S is :" + s);
	}
}