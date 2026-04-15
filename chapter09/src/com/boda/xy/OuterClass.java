package com.boda.xy;

public class OuterClass {
	private int x = 200;

	public class InnerClass { // 成员内部类定义
		int y = 300;

		public int calculate() {
			return x + y; // 可以访问外层类的成员x
		}
	}

	public void makeInner() {
		InnerClass ic = new InnerClass(); // 创建内部类对象
		IO.println(ic.calculate());
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		IO.println(inner.calculate()); // 输出500
	}
}
