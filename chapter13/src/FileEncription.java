void main() throws IOException{
	    var input = new Scanner(System.in);
	    String sourceFile = null;
	    String secretFile = null;
	    var keyValue = 0;
	    IO.print("请输入源文件名: ");
	    sourceFile = input.nextLine();
	    IO.print("请输入加密文件名: ");
	    secretFile = input.nextLine();
	    IO.print("请输入秘钥： ");
	    keyValue = input.nextInt();
	   
	    var srcFile = new File(sourceFile);
	    var encFile = new File(secretFile);
	   
	    if(!srcFile.exists()) {
		    IO.println("源文件不存在！ ");
		    System.exit(0);
	    }
	   
	    if(!encFile.exists()) {
		    //IO.println("创建加密文件！ ");
		    encFile.createNewFile();
	    }
	    try(
		   var fis = new FileInputStream(srcFile);
		   var fos = new FileOutputStream(encFile);	   
	    ) {
		    var dataOfFile = fis.read();
		    while(dataOfFile !=-1) {
			    dataOfFile = dataOfFile ^ keyValue;
			    fos.write(dataOfFile);
			    dataOfFile = fis.read();
		    }   
	    }
	    IO.println("文件加密完成！ ");
	    input.close();
}

