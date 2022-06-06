class BitAnd{

	public static void main(String args[]){
		
		int p,q;
		p=2; q=4;			
		System.out.println((p>q) & ++p!=--q);
		System.out.println((q==p) | p==q );
		System.out.println("Value of P is: " + p);
		System.out.println("Value of Q is: " + q);
	}
	
}