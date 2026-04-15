void main() {
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int a,b,c;
	IO.print("请输入一个整数（0-1000）：");
	int num = input.nextInt();
	a = num % 10;
	b = num / 10 %10;
	c = num /100;
	sum = a + b + c;
	IO.print("各位数字的和是：" + sum);
}