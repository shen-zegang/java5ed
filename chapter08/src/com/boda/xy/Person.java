package com.boda.xy;

public class Person{
   public String name;
   public int age;
   public Person(){      // 无参构造方法
   }
   public Person(String name, int age){    // 带参数构造方法
     this.name = name;
     this.age = age;
   }
   public void sayHello(){
        IO.println("My name is " + name);
   }
}
