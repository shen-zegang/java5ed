package com.boda.xy;
public class SomeClass{
   int x = 5;
   static int y = 48;
   // 静态方法的定义
   public static void display(){
      y = y + 100;  
      IO.println("y = "+ y);
      //x = x * 5 ;
      //IO.println("x = "+ x);
   }
}

