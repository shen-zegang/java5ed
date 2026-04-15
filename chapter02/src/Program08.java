void main() {
	double a,b,c;
	double root;
	Scanner input = new Scanner(System.in);
    IO.println("请输入a,b,c的值：");
	a = input.nextDouble();
	b = input.nextDouble();
	c = input.nextDouble();
	root = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
    IO.println("方程的一个根是：" + root);
}
