package com.boda.xy;

public class IntStack {
	private Integer[] elements;
	private int size = 0;
	public static final int DEFAULT_CAPACITY = 10;

	public IntStack() {
		this(DEFAULT_CAPACITY);
	}

	public IntStack(int capacity) {
		elements = new Integer[capacity];
	}

	public void push(Integer value) {
		if (size >= elements.length) {
			// 创建一个长度是原数组长度2倍的数组
			Integer[] temp = new Integer[elements.length * 2];
			// 将原来数组元素复制到新数组中
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	public Integer pop() {
		return elements[--size];
	}

	public Integer peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

}
