package com.boda.xy;

public class MyOuter2 {
	String s1 = "Hello";
	static String s2 = "World";

	interface MyInterface { // 内部接口的声明
		void show();
	}

	static class MyInner2 implements MyInterface {
		public void show() {
			IO.println("s1 = " + new MyOuter2().s1);
			IO.println("s2 = " + s2); // 可以访问外层类的static变量
		}
	}

	public static void main(String[] args) {
		MyInner2 inner2 = new MyInner2();
		inner2.show();
	}
}
