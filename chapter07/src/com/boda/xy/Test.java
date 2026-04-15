package com.boda.xy;

class Parent{
    public void display(double i){
        IO.println(i);
    }
}
class Child extends Parent{
    public void display(double i){
        IO.println(2 * i);
    }
}

public class Test{
     public static void main(String[] args){
        Child obj = new Child();
         obj.display(10);
        obj.display(10.0);
     }
}

