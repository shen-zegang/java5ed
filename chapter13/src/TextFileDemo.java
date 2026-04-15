void main() {
	   File file = new File("number.txt");
       try(
          InputStream input = new FileInputStream(file);
    	  Scanner sc = new Scanner(input)   
       ){
    	  while (sc.hasNextInt()) {
    	    int token = sc.nextInt();
    		IO.println(token);
    	  }   
       }catch(IOException e){
		   e.printStackTrace();}	

}
