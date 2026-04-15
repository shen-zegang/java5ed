package com.boda.xy;
public class Square extends Shape {
	double side;
	public Square() {
		this.side = 0;
	}
	public Square(double side) {
		this.side = side;
	}
	public double getArea() {
		double area = side * side;
		return area;
	}
	public double getPerimeter() {
		return 4 * side;
	}
	public static void main(String[] args) {
		Square sq = new Square(5);
		System.out.println(sq.getArea());
	}
}
