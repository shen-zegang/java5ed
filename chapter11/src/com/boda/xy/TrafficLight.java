package com.boda.xy;
public enum TrafficLight {
	GREEN, RED, YELLOW;

	public static void main(String[] args) {
		TrafficLight[] tl = TrafficLight.values();
		for (TrafficLight light : tl) {
			System.out.print(light);
			System.out.println("  " + light.ordinal());
		}
		TrafficLight red = TrafficLight.RED;
		switch (red) {
		case RED-> System.out.println("RED, stop.");
		case GREEN->
			System.out.println("GREEN, go.");
		
		case YELLOW->
			System.out.println("YELLOW, do not know.");
		}
	}
}
