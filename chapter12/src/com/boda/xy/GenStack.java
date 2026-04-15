package com.boda.xy;

public class GenStack<E> {
    private E[] elements;
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public GenStack() {
        this(DEFAULT_CAPACITY);
    }
    public GenStack(int capacity) {
        elements = (E[])(new Object[capacity]);
    }
    public void push(E value) {
        if (size >= elements.length) {
            // 创建一个长度是原数组长度2倍的数组
            E[] temp = (E[])(new Object[elements.length * 2]);
            // 将原来数组元素复制到新数组中
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    public E pop() {
        return elements[--size];
    }
    public E peek() {
        return elements[size - 1];
    }
    public boolean empty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}

