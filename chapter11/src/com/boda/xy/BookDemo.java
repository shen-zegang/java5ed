package com.boda.xy;

public class BookDemo {

	public static void main(String[] args) {
		Book book = new Book(101,"Java编程思想","Bruce Echel",72,"机械工业出版社");
		Book book2 = new Book(105,"Java Web编程技术","沈泽刚",63.8,"清华大学出版社");
		System.out.println(book.id());
		System.out.println(book.name());
		System.out.println(book.press());
		System.out.println(book.compareTo(book2));
	}

}
