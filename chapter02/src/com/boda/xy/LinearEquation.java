package com.boda.xy;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		double a,b,c,d,e,f;
		double x,y;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,e的值：");
		a = input.nextDouble();
		b = input.nextDouble();
		e = input.nextDouble();
		System.out.print("请输入c,d,f的值：");
		c = input.nextDouble();
		d = input.nextDouble();
		f = input.nextDouble();
		if(a*d-b*c == 0) {
			System.out.println("方程组无解！");
		}else {
			x =(e*d-b*f)/(a*d-b*c);
			y =(a*f-e*c)/(a*d-b*c);
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		}
	}
}
