package com.boda.xy;

public class Orange implements Eatable {
	@Override
	public String howToEat() {
		return "榨橘汁";
	}
	public static void main(String[] args) {
		IO.println(Orange.STATUS);
	}
}
