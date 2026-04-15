public class Circle {
    double centerX;
    double centerY;
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}

void main() {
    Circle c = new Circle();
    System.out.println(c.getRadius());
    c.setRadius(10);
    System.out.println(c.getArea());
    System.out.println(c.getPerimeter());
}
