package com.boda.xy;

@FunctionalInterface
public interface Calculator {
	public abstract double calculate(int a, int b); // 唯一的抽象方法

	public default int subtract(int a, int b) {
		return a - b;
	}

	public default int add(int a, int b) {
		return a + b;
	}
}
