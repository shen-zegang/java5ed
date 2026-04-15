package com.boda.xy;

public interface Person extends Mammal{
	public default void work(){
		System.out.println("I can working.");
	}
}


