package com.boda.xy;

import java.util.Scanner;

public class StringSwitchDemo {
	public static void main(String[] args) {
		String season = "";
		Scanner input = new Scanner(System.in);
		IO.print("请输入英文季节名称：");
		season = input.next();
		switch (season.toLowerCase()) {
		case "spring" -> IO.println("春天");
		case "summer" -> IO.println("夏天");
		case "autumn" -> IO.println("秋天");
		case "winter" -> IO.println("冬天");
		default -> IO.println("输入名称错误！");
		}
	}
}
