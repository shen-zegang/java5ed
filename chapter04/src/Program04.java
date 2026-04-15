public class Triangle {
    double a, b, c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

void main() {
    Triangle ta = new Triangle(3, 4, 5);
    System.out.println(ta.area());
}
