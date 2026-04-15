package com.boda.xy;
import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		double radius,area;
		// 第1步：读取半径值
		Scanner input = new Scanner(System.in);
		IO.print("请输入半径值：");		
		radius = input.nextDouble();
		// 第2步：计算圆面积
		if(radius<0){
			IO.println("半径值不应该小于零。");
			System.exit(0);
		}else{
			area = Math.PI * radius *radius;
			
			// 第3步：输出圆面积
	        IO.println("圆的面积为：" + area);
		}	
	}
}
