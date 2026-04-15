void main(){
      int a = 5;
      try{
        int b = a / 0; 
         IO.println("b = " + b);
      }catch(ArithmeticException e){
    	  IO.println(e);
      }
      IO.println("a = " + a);
}
