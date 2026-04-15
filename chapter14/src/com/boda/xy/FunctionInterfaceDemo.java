package com.boda.xy;


public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("234");
		System.out.println(converted + 6);               // 输出234
	}
}