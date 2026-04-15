package com.boda.xy;

public class Person {
    private String name;
    private int age;
    public Person(){
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        IO.println("我叫 " + name + ",今年 " + age + "岁");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
