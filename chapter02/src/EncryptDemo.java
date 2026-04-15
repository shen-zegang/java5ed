void main() {
    char c;
    Scanner input = new Scanner(System.in);
    IO.print("请输入加密的字符：");
    c = input.next().charAt(0);
    c = (char)(c ^ 'A');
    IO.println("加密后的字符是："+c);
    c = (char)(c ^ 'A');
    IO.println("解密后的字符是："+c);
}