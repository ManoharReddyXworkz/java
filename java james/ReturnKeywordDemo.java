class ReturnKeywordDemo{

static int add(int a, int b){
     int result =  a+b;
   return result;
}

public static void main(String[] args){
  int result =  add(3,6);
    System.out.println("3+6 = "+ result);

}


}