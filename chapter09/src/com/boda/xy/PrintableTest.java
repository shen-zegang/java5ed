package com.boda.xy;

interface Printable {
	public abstract void print(String message);
}

public class PrintableTest {
	public static void main(String[] args) {
		Printable printer = new Printable() {
			@Override
			public void print(String message) {
				IO.println(message);
			}
		};
		printer.print("这是惠普打印机");
	}
}
