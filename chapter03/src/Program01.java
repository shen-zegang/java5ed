void main() {
    int num;
    Scanner input = new Scanner(System.in);
    IO.println("请输入一个正整数：");
    num = input.nextInt();
    if (num % 2 == 0) {
        IO.println(num + "是偶数");
    } else {
        IO.println(num + "是奇数");
    }
}
