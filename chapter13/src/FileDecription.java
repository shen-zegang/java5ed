void main() throws IOException{
	    var input = new Scanner(System.in);
	    String secretFile = null;
	    String resultFile = null;
	    var keyValue = 0;
	    IO.print("请输入要解密文件: ");
	    secretFile = input.nextLine();
	    IO.print("请输入解密后文件名: ");
	    resultFile = input.nextLine();
	    IO.print("请输入秘钥： ");
	    keyValue = input.nextInt();
		   
	    var encFile = new File(secretFile);
	    var decFile = new File(resultFile);
		   
	    if(!encFile.exists()) {
		   IO.println("解密的文件不存在！ ");
		   System.exit(0);
	    }
		   
	    if(!decFile.exists()) {
		   //IO.println("创建目标文件！ ");
		   decFile.createNewFile();
	    }
	    try(
		   var fis = new FileInputStream(encFile);
		   var fos = new FileOutputStream(decFile);	   
	    ) {
		   var dataOfFile = fis.read();
		   while(dataOfFile !=-1) {
			   dataOfFile = dataOfFile ^ keyValue;
			   fos.write(dataOfFile);
			   dataOfFile = fis.read();
		   }   
	    }
	    IO.println("文件解密完成！ ");
	    input.close();  

}
