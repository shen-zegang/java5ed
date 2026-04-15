public class Calculator {
    double a;
    double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return this.a + this.b;
    }

    public double minus() {
        return this.a - this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    public double divide() {
        return this.a / this.b;
    }
}

void main() {
    Calculator c = new Calculator(5.0, 3.0);
    System.out.println(c.add());
}
