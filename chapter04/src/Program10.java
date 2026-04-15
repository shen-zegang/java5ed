public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double discriminant;
        discriminant = b * b - 4 * a * c;
        return discriminant;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
void main() {
    double a, b, c;
    Scanner input = new Scanner(System.in);
    IO.print("请输入a,b,c值");
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    QuadraticEquation equation = new QuadraticEquation(a, b, c);
    double discriminant = equation.getDiscriminant();
    IO.println(discriminant);
    if (discriminant < 0) {
        IO.println("方程无实数根");
    } else if (discriminant == 0) {
        IO.println("方程的根为x=" + equation.getRoot1());
    } else {
        IO.println("方程的根x1=" + equation.getRoot1());
        IO.println("方程的根x2=" + equation.getRoot2());
    }
}

