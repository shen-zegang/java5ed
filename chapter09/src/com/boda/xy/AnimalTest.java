package com.boda.xy;

class Animal {
	public void eat() {
		IO.println("I like eat anything.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Animal() { // 继承Animal类
			@Override
			public void eat() {
				IO.println("I like eat bones.");
			}
		}; // 这里的分号是赋值语句的结束
		dog.eat();
	}
}
