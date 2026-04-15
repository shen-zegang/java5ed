package com.boda.xy;
import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		double radius,area,perimeter;
		
		// 第1步：读取半径值
		Scanner input = new Scanner(System.in);
		System.out.print("请输入半径值：");
		radius = input.nextDouble();
		
		// 第2步：计算圆面积和周长
		area = Math.PI * radius * radius;
		perimeter = Math.PI * radius; 
		// 第3步：输出圆面积和周长
        System.out.println("园的面积是：" + area);
        System.out.println("园的周长是：" + perimeter);
	}
}
