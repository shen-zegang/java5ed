void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	IO.print("请输入一个两位数：");
	n = input.nextInt();

	IO.print(n%10);
	IO.println(n/10);
}
