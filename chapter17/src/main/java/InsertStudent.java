import module java.sql;
void main(String[] args) throws Exception {
        try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
        }catch(ClassNotFoundException cne){
            cne.printStackTrace();
        }
        var dburl= "jdbc:mysql://127.0.0.1:3306/webstore?serverTimezone=UTC";
        var sql = "INSERT INTO students VALUES(?,?,?)";
        try(var conn = DriverManager.getConnection(dburl,"root","123456");
		        var pstmt = conn.prepareStatement(sql);
             var fis = new FileInputStream("files\\1003.png");
        ) {      	
     	      pstmt.setInt(1,1002);
      	  pstmt.setString(2,"李清泉");
   	      pstmt.setBinaryStream(3,fis,(int)(fis.available()));
           int n = pstmt.executeUpdate();
           if(n==1) {
        	      System.out.println("插入一条记录！");
           }else {
        	      System.out.println("插入记录失败！"); 
           }
       }
}
