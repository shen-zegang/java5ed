package com.boda.xy;

public class Outer {
	private int x = 300;

	public class Inner {
		int y = 400;

		public int calculate() {
			return x + y;
		}
	}

	public void makeInner() {
		Inner ic = new Inner(); // 创建内部类对象
		IO.println(ic.calculate());
	}

	public static void main(String[] args) {
		var outer = new Outer();
		var inner = outer.new Inner();
		IO.println(inner.calculate()); // 输出：500
	}
}
