package com.boda.xy;

//import javafx.beans.InvalidationListener;
//import javafx.beans.Observable;
//import javafx.beans.property.DoubleProperty;
//import javafx.beans.property.SimpleDoubleProperty;

import module javafx.controls;
public class ObservablePropertyDemo {
	public static void main(String[] args) {
		DoubleProperty balance = new SimpleDoubleProperty();
		// 为属性添加事件监听器
		balance.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable ov) {
				System.out.println("新的属性值为：" + balance.doubleValue());
			}
		});
		// 改变属性的值，引发执行监听器
		balance.set(8.8);
	}
}
