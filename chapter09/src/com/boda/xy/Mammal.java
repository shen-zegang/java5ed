package com.boda.xy;
public interface Mammal {
    public default void eat(){
        System.out.println("I can eat anything.");
    }
    public static void speak(){
        System.out.println("I can speak English.");
    }
}

