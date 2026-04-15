void main() {
	Scanner input = new Scanner(System.in);
	double fahrenheit;
	IO.print("请输入华氏温度：");
	fahrenheit = input.nextDouble();

	double celsius = (5.0/9) * (fahrenheit -32);
    IO.println("华氏温度 :" + fahrenheit);
    IO.println("摄氏温度 :" + celsius);
}
