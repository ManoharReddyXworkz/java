class ReturnKeywordDemo{

int add(int a, int b){
     int result =  a+b;
    return result;
}

public static void main(String[] args){

   int result = add(2,4);
  System.out.println("2+4 = "+result);

}


}