void main() {
	Scanner sc = new Scanner(System.in);
	IO.print("请输入圆柱底面半径：");
	double radius = sc.nextDouble();
	System.out.print("请输入圆柱高：");
	double height = sc.nextDouble();
	System.out.printf("圆柱的体积：%8.2f", Math.PI*radius*radius*height);
}
