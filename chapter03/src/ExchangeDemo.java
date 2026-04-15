void main() {
	Scanner input = new Scanner(System.in);
	IO.print("请输入整数a：");
	int a = input.nextInt();
    IO.print("请输入整数b：");
	int b = input.nextInt();
	if (a > b) {
		int t = b;
		b = a;
		a = t;
	}
    IO.println(" a = " + a);
    IO.println(" b = " + b);
}
