public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point)
            return this.x == ((Point) obj).x &&
                    this.y == ((Point) obj).y;
        else
            return false;
    }
}
void main() {
    Point p = new Point(3, 5);
    Point p2 = new Point(3, 5);
    IO.println(p.toString());
    IO.println(p.equals(p2));
    IO.println(p.hashCode());
    IO.println(p2.hashCode());
}
