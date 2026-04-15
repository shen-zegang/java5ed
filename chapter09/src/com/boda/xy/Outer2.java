package com.boda.xy;

public class Outer2 {
	private static int x = 100;

	public static class Inner2 {
		private String y = "hello";

		public void innerMethod() {
			IO.println("x is " + x); // 可以访问外层类的静态成员x
			IO.println("y is " + y);
		}
	}

	public static void main(String[] args) {
		Inner2 snc = new Inner2();
		snc.innerMethod();
	}
}
