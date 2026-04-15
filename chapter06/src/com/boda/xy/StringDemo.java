package com.boda.xy;
public class StringDemo {
	public static void main(String[] args) {
	   String s = new String("Hello,world");
	   s.replace('o', 'A');
	   s = s.substring(0,6).concat("Java");
	   s.toUpperCase();
	   
	   IO.println(s); // Hello,Java
	}

}
