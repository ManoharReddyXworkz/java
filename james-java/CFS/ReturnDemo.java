class ReturnDemo{
         static int add(int a, int b){
	 int result = a+b;
	 return result;
         }
	public static void main(String args[]){
	        int result = add(7,5);
		System.out.println("Addition of 7 & 5 is: " + result); 
     }
}