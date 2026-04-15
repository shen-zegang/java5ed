package com.boda.xy;
public class TestEmpStack {
    public static void main(String[] args) {
        EmpStack stack = new EmpStack();

        stack.push(new Employee(1, "张三", 5000));
        stack.push(new Employee(2, "李四", 6000));
        stack.push(new Employee(3, "王五", 7000));

        IO.println("当前栈大小: " + stack.getSize());
        IO.println("栈顶元素: " + stack.peek());

        Employee emp = stack.pop();
        IO.println("出栈元素: " + emp);

        IO.println("当前栈大小: " + stack.getSize());
    }
}