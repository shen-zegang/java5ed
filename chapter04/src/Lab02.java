public class Point {
    double x;
    double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point p) {
        return Math.sqrt(
                (this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public void moveTo(double x, double y) {  // x和y是新点的坐标
        this.x = x;
        this.y = y;
    }

    public void moveTo(Point p) {   // p是新的点
        this.x = p.x;
        this.y = p.y;
    }
}

void main() {
    Point start = new Point();
    start.setX(10);
    start.setY(20);
    Point end = new Point(20, 30);
    System.out.println("start.x=" + start.x + ", strat.y=" + start.y);
    System.out.println("end.x=" + end.x + ", end.y=" + end.y);
}