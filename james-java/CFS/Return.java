class Return{
         void increment(int number){
	    if(number<10){
		number++;
		System.out.println(number);
		return;
            }
       }
	public static void main(String args[]){
	        Return value = new Return();
		value.increment(4);
		System.out.println("In main");
		value.increment(9);
		System.out.println("In main"); 
     }
}

