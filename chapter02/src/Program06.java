void main() {
	double height, weight;
	Scanner input = new Scanner(System.in);
	IO.print("请输入体重（公斤）：");
	weight = input.nextDouble();
    IO.print("请输入身高（米）：");
    height = input.nextDouble();
    double bmi = weight /(height*height);
    IO.println("你的BMI值是："+bmi);
}