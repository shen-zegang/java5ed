void main() {
	double radius,area,perimeter;
		
	// 第1步：读取半径值
	Scanner input = new Scanner(System.in);
	System.out.print("请输入半径值：");
	radius = input.nextDouble();
		
	// 第2步：计算圆面积和周长
	area = Math.PI * radius * radius;
	perimeter = 2 * Math.PI * radius;
	// 第3步：输出圆面积和周长
    System.out.printf("园的面积是：%.2f%n" , area);
    System.out.println("园的周长是：" + perimeter);
}
