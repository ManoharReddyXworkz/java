class Break{

	public static void main(String args[]){
	    String s[] = {"Dev", "Light", "Shadow", "Falls","Machine"};
		String SearchName = "Light";
		 int i;
		 boolean FoundName = false;
	          for(i=1; i<s.length; i++){
                    if(s[i]==SearchName){
                       FoundName = true;
	                break;
			}
		     }
			if(FoundName){
		  		System.out.println("The Name"+SearchName+"found"+i);
		        }
			else{
                              System.out.println("The Name"+SearchName+" is not found in array");
			  }
	    	}
     }