package com.boda.xy;

import java.util.Scanner;
public class RationalDemo {

	public static void main(String[] args) {
		int a , b, c, d, result;
		Scanner input = new Scanner(System.in);
		IO.print("请输入4个整数：");
		
	    a = input.nextInt();
	    b = input.nextInt();
	    c = input.nextInt();
	    d = input.nextInt();
        
		if(c - d ==0){
        	IO.println("输入的数据不合法！");
        }else{
        	result = (a+b)/(c-d);
        	IO.println("计算结果为" + result);
        }
	}
}
