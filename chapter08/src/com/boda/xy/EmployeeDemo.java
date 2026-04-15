package com.boda.xy;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"刘明",5000);
        Employee emp2 = new Employee(101,"刘明文",5000);

        IO.println(emp.equals(emp2));    // 比较引用（地址）   true
        IO.println(emp.hashCode());
        IO.println(emp2.hashCode());

    }
}
