void main() {
	Scanner input = new Scanner(System.in);
    IO.print("请输入一个double型数：");
	double d = input.nextDouble();
	int n = (int)d;
    IO.println("整数部分：" + n);
    IO.println("小数部分：" + (d-n));
}
