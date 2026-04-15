package com.boda.ab;
public class OuterClass2 {
	private Integer x = 100;
	private void show() {
		IO.println("x = " + x);
	}
	class InnerClass { // 局部内部类
		public void method() {
			x = 500; // 修改外部类的成员值
			show(); // 调用外部类的方法
		}
	}
	public static void display() {
		// 这里必须通过外部类引用创建内部类实例
		OuterClass2 oc = new OuterClass2();
		InnerClass ic = oc.new InnerClass();
		ic.method();
	}
	public static void main(String[] args) {
		display();
	}
}
