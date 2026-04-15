void main() {
    Scanner input = new Scanner(System.in);
    IO.print("请输入整数a,b,c,d：");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    if (c - d == 0) {
        IO.print("分母不能为零。");
    } else {
        IO.print("计算结果为：" + (a + b) / (c - d));
    }
}