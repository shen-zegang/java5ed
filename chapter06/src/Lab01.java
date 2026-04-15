void main() {
    String s;
    Scanner input = new Scanner(System.in);
    IO.print("请输入一个字符串：");
    s = input.nextLine();
    IO.println("字符串长度是：" + s.length());
    IO.println("字符串第一个字符是：" + s.charAt(0));
    IO.println("字符串最后一个字符是：" + s.charAt(s.length() - 1));
    IO.println("大写字母串是：" + s.toUpperCase());
}

