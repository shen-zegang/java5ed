package com.boda.xy;
import java.util.Scanner;
public class AdditionQuiz {
	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);         // [0.0-1.0)
		int number2 = (int)(Math.random()*10);
		System.err.print(number1 + "+" + number2 +"=");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if(answer ==(number1+number2)){
        	IO.println("恭喜你，答对了！");
        }else{
        	IO.println("很遗憾，答错了！");
        	IO.println(number1 +"+"+number2 +"="+(number1+number2));
        }
	}

}
