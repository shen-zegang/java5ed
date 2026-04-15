package com.boda.xy;
import java.util.NoSuchElementException;
public class EmpStack {
    private Employee[] elements;   // 存储Employee对象的数组
    private int size = 0;          // 当前栈中元素个数
    public static final int DEFAULT_CAPACITY = 10;

    // 默认构造方法
    public EmpStack() {
        this(DEFAULT_CAPACITY);
    }
    // 带参数构造方法
    public EmpStack(int capacity) {
        elements = new Employee[capacity];
    }
    // 入栈
    public void push(Employee value) {
        if (size >= elements.length) {
            // 扩容为原来的2倍
            Employee[] temp = new Employee[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    // 出栈
    public Employee pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空，无法出栈！");
        }
        return elements[--size];
    }
    // 查看栈顶元素
    public Employee peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空，无法查看栈顶元素！");
        }
        return elements[size - 1];
    }
    // 判空
    public boolean isEmpty() {
        return size == 0;
    }
    // 返回栈大小
    public int getSize() {
        return size;
    }
}
