package com.boda.xy;

import java.util.Random;
public class IntStackDemo{
public static void main(String[] args){
        var stack = new IntStack();
var rand = new Random();
// 向栈中存入11个随机生成的整数

stack.push("北京");
stack.push("上海");
stack.push("广州");

System.out.println(stack);
// 弹出栈中的所有元素
System.out.println( "栈大小为： "+ stack.getSize());
while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}

