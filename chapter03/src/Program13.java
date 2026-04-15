void main() {
    String s = "";
    int n;
    Scanner input = new Scanner(System.in);
    IO.print("请输入一个正整数:");
    n = input.nextInt();
    while (n > 0) {
        s = (n % 2) + s;
        n = n / 2;
    }
    IO.println(s);
}


