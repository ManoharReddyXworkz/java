class Pattern1{
      public static void main(String args[]){
	for(int i=1; i<=2; i++){		 | i = 1, true:: 2, true:: 3, false 
		 int k=1;                        | k = 1. k=1
		for(int j=1; j<=4; j++)          | j = 1, true:: 2, true :: 3,true :: 4, true :: 5, false.   ::||  j= 1, true:: 2, true:: 3,true:: 4,true:: 5,false 
		{
		  System.out.print((j+k));       //2,(2+2), (3+3), (4+4).    /// (1+1), (2+2), (3+3), (4+4).
 			k++;		         //2,3,4,5                 /// 2, 3, 4, 5 
		}
		System.out.println();
	     }
			
	  }
       }