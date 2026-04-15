void main(){
     // 向文件中写数据
     try(
           FileOutputStream output = new FileOutputStream("data.dat");
           DataOutputStream dataOutStream = new DataOutputStream(
    			                    new BufferedOutputStream(output));
     ){
    	dataOutStream.writeDouble(123.456);    // 8
    	dataOutStream.writeInt(100);           //4
    	dataOutStream.writeUTF("Java语言");     // 2 + 10
     }catch(IOException e){
    	 e.printStackTrace();
   	 }
    IO.println("数据已写到文件中。");

     // 从文件中读取数据
	 try(
           FileInputStream input = new FileInputStream("data.dat");
	       DataInputStream dataInStream = new DataInputStream(
	                                 new BufferedInputStream(input));
     ){
		  while(dataInStream.available()>0){
		      double d = dataInStream.readDouble();
		      int i = dataInStream.readInt();
		      String s = dataInStream.readUTF();
		      IO.println("d = "+d);
              IO.println("i = "+i);
              IO.println("s = "+s);
		  }
	   }catch(IOException e){
	       e.printStackTrace();
	   }
 }
