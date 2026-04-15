public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }
}

void main() {
    Rectangle rect = new Rectangle();
    rect.setLength(20);
    rect.setWidth(10);
    IO.println("该矩形的长为：" + rect.getLength());
    IO.println("该矩形的宽为：" + rect.getWidth());
    IO.println("该矩形的周长为：" + rect.getPerimeter());
    IO.println("该矩形的面积为：" + rect.getArea());
}
