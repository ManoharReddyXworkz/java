class ReturnValue{
         int Sum(int x, int y){
	 int sum = 0;
	 sum=x+y;
	 return sum;	
          }
	 int Diff(int x, int y){
	 int difference = 0;
	 difference= x-y;
	 return difference;
	  } 
	public static void main(String args[]){
		ReturnValue value = new ReturnValue();
		System.out.println("Sum of numbers are:" + value.Sum(10,7));
		System.out.println("Difference of numbers are:" + value.Diff(10,7)); 
     }
}