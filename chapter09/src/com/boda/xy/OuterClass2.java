package com.boda.xy;

public class OuterClass2 {
	private String x = "hello";

	public void makeInner(int param) {
		final String y = "local variable";
		class InnerClass { // 局部内部类
			public void seeOuter() {
				IO.println("x = " + x);
				IO.println("y = " + y);
				IO.println("param = " + param);
			}
		}
		new InnerClass().seeOuter();
	}

	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.makeInner(47);
	}
}
