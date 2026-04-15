void main() {
    try{
        boolean success = false;
        var file = new File("Hello.txt");
        IO.println(file.exists());             // 输出文件是否存在
        success = file.createNewFile();        // 创建文件是否成功
        IO.println(success);
        IO.println(file.exists());             // 输出文件是否存在
    }catch(IOException e){
        IO.println(e.toString());
    }
}