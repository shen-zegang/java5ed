package com.boda.xy;

import java.util.Scanner;
public class ScoreLevel {

	public static void main(String[] args) {
		double score;
		Scanner input = new Scanner(System.in);
		IO.print("请输入成绩：");
		score = input.nextDouble();
		String level = "";
		if(score>100 || score<0){
			IO.println("输入的成绩不正确！");
			System.exit(0);
		}else if(score>=90){
			level="优秀";
		}else if(score >=80){
			level="良好";
		}else if(score >=70){
			level="中等";
		}else if(score >=60){
			level="及格";
		}else{
			level="不及格";
		}
        IO.println("你的成绩等级是："+level);
	}

}
