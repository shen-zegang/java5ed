package com.boda.xy;

public class Duck implements Swimmable,Flyable{
    @Override
	public void swim(){
	   IO.println("I can swim.");
    }
   @Override
    public void fly(){
	   IO.println("I can fly.");
   }
   public static void main(String[]args){
	   Duck d = new Duck();
	   d.swim();
	   d.fly();
	   Swimmable s = d;   // 自动类型转换
	   s.swim();          //调用实现类的swim()方法
   }
}

