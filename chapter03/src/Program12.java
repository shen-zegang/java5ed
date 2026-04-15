void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IO.print("请输入一个整数：");
    int n, sum = 0;
    n = input.nextInt();
    while (n > 0) {
        sum = sum + n % 10;
        n = n / 10;
    }
    IO.println("各位数字之和为：" + sum);
}
