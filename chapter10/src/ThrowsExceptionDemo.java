void method (int value) throws ArithmeticException,
	        ArrayIndexOutOfBoundsException{
	   if(value == 0){
	       IO.println("无异常发生");
	       return;
	   }else if(value == 1){
	       int iArray[] = new int[4];
	       iArray[4] = 3;
	   }
}
	
void main(){
	try{
	    method (0);
	    method (1);
	    method (2);      // 该语句不能被执行
	}catch(ArrayIndexOutOfBoundsException e){
	    IO.println("捕获到:" + e);
	}finally{
	    IO.println("执行finally块."); }
}

