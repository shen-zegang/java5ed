package com.boda.ab;
public class Outer {
	class Inner {
		public void show() {
			IO.println("Inner Class");
		}
	}

	public Inner makeInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Inner inner = new Outer().makeInner();
		inner.show();
	}
}
