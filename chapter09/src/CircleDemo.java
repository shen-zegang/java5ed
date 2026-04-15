import com.boda.xy.Circle;

void main() {
    Circle[] circles = new Circle[] { new Circle(3.4), new Circle(2.5), new Circle(5.8), };
    IO.println(circles[0].compareTo(circles[1]));
    // 对circles数组中3个Circle对象排序
    Arrays.sort(circles);
    for (Circle c : circles)
        System.out.printf("%6.2f%n", c.getArea());
}