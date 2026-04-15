public class BMICalculator {
    double weight, height, bmi;

    public BMICalculator(double weight, double height) {
        super();
        this.weight = weight;
        this.height = height;
    }

    public double calculate() {
        bmi = this.weight / (this.height * this.height);
        return bmi;
    }

    public boolean isOverWeight() {
        if (bmi >= 25) {
            return true;
        } else {
            return false;
        }

    }
}
void main() {
    double weight, height;
    Scanner input = new Scanner(System.in);
    IO.print("请输入体重（kg）:");
    weight = input.nextDouble();
    IO.print("请输入身高(m):");
    height = input.nextDouble();
    BMICalculator bmic = new BMICalculator(weight, height);
    double bmi = bmic.calculate();
    IO.println("你的BMI是：" + bmi);
    IO.println("你的体重：" + ((bmic.isOverWeight()) ? "超重" : "不超重"));
}
