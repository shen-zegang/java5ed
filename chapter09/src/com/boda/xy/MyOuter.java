package com.boda.xy;

public class MyOuter {
	private static int x = 100;

	public static class MyInner { // 静态内部类
		private String y = "hello";

		public void innerMethod() {
			IO.println("x is " + x); // 可以访问外层类的静态成员x
			IO.println("y is " + y);
		}
	}

	public static void main(String[] args) {
		// 不需要外层类的实例就可以直接创建一个静态内部类实例
		MyInner snc = new MyInner();
		snc.innerMethod();
	}
}
