void main(String[] args) throws IOException {
    String fileName = "output.txt";
    PrintWriter out = new PrintWriter(new File(fileName));
    Scanner input = new Scanner(System.in);
    // 从键盘读取数据，写入文本文件
    IO.print("请输入一个字符串：");
    String s = input.nextLine();
    out.println(s);
    IO.print("请输入一个整数：");
    int n = input.nextInt();
    out.println(n);
    IO.print("请输入一个浮点数：");
    double d = input.nextDouble();
    out.println(d);
    out.flush();
    input.close();
}
