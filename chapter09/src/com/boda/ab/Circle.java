package com.boda.ab;
public class Circle implements Comparable<Circle> {
	private double radius;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() { // 求周长方法
		return 2 * radius * Math.PI;
	}
	public double getArea() { // 求面积方法
		return radius * radius * Math.PI;
	}
	@Override
	public int compareTo(Circle circle) {
		return (int)(getArea() - circle.getArea());
	}
	public static void main(String[] args) {
		Circle[] circles = new Circle[] {new Circle(2),new Circle(3)};
		IO.println(circles[0].getArea());
		IO.println(circles[1].getArea());
		IO.println(circles[0].compareTo(circles[1]));
	}
}

