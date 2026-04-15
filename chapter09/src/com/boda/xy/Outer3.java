package com.boda.xy;

public class Outer3{
    String s1 = "Hello";
    static String s2 = "World";
    interface MyInterface{    
        abstract void show();
    }
    static class Inner3 implements MyInterface{
       public void show(){
          IO.println("s1 = " + new Outer3().s1);
          IO.println("s2 = " + s2); // 可以访问外层类的static变量
       }
   }
   public static void main(String[] args){
       Inner3 inner3 = new Inner3();
       inner3.show();
   }
}

