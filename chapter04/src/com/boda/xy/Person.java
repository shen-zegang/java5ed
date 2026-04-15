package com.boda.xy;

public class Person {
    String name;
    int age;
    public void setName(String name){
      this.name = name;
    }
    public String getName(){
      return name;
    }
    public void setAge(int age){
      this.age = age;  
    }
    public int getAge(){
      return age;  
    }
    public void speak(){
       System.out.println("姓名："+name);
       System.out.println("年龄："+age);
    }
    public static void main(String[]args){
      Person p = new Person();
      p.setName("张大海");
      p.setAge(20);
      p.speak();
      System.out.println(p.getName());
      System.out.println(p.getAge());
    }
}

