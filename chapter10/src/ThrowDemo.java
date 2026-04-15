public void method() throws IOException{
	try{
	     throw new IOException("文件未找到");
	}catch(IOException e){
	     IO.println("捕获到异常");
	     throw e;   // 将捕获到的异常对象再次抛出
	}
}
	   
void main(String[] args){
	try{
	      method();
	}catch(IOException e){
	      IO.println("再次捕获：" + e);
	}
}
