package com.boda.xy;

public interface BB {
	public abstract void show(); // 一个抽象方法

	public default void print() { // 一个默认方法
		IO.println("这是接口BB的默认方法");
	}
}
