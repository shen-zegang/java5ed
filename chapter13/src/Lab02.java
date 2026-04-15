void main(String[] args) throws IOException {
    String fileName = "output.txt";
    PrintStream out = new PrintStream(new File(fileName));
    // 向文件中随机写入100个整数
    for (int i = 0; i < 100; i++) {
        int num = (int) (Math.random() * 101) + 100;
        out.println(num);
    }
}
