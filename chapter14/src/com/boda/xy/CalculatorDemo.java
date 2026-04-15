package com.boda.xy;
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator cal = (a, b) -> a * a + b * b;
		int a = 10;
		int b = 20;
		double result = cal.calculate(a, b);
		System.out.println(result);
	}
}
