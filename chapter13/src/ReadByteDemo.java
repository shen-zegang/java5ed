void main() {
      var inputFile = new File("output.dat");
      try(
           var in = new FileInputStream(inputFile);
      ) {
          int c = in.read();
          while (c != -1){
              IO.print(c + " ");
              c = in.read();
          }
    }catch(IOException e){
         IO.println(e.toString());
    }
    IO.println("\n数据读取完毕！");
}

