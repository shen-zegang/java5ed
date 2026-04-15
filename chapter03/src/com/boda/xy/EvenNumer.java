package com.boda.xy;

import java.util.Scanner;
public class EvenNumer {

	public static void main(String[] args) {
		int a = 13, b = 5, c = 2;
		int max;
		if(a>b){
			if(a>c)
			   max =a;
			else
			  max=c;
		}else{
			if(b>c)
			  max = b;
			else
			  max = c;
		}
		
		IO.print("最大值是："+max);
	}

}
