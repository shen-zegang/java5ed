package com.boda.xy;

public class Employee {   // Employee.class
    public String name;    // 字段  field  成员变量    CamelCase   camelCase
    public int age = 20;
    public double salary;
     //默认构造方法
    public Employee(){
        //this("张大海",20);
    }

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Employee(String name, int age, double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("salary不能为负值！");
        }
        this(name, age);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void sayHello(){     //次行格式
        IO.println("Hello,My name " + this.getName());
        IO.println("My age is " + this.getAge());
    }
    public double computeSalary(int hours, double rate){
        double totalSalary = getSalary() + hours * rate;
        return totalSalary;
    }
}
