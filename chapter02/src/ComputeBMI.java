void main() {
    double height, weight;
    Scanner input = new Scanner(System.in);
    System.out.print("请输入体重（公斤）：");
    weight = input.nextDouble();
    System.out.print("请输入身高（米）：");
    height = input.nextDouble();
    double bmi = weight / (height * height);
    System.out.println("你的BMI值是：" + bmi);
}