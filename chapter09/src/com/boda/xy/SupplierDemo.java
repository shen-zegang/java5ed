package com.boda.xy;
import java.util.Random;
import java.util.function.Supplier;
public class SupplierDemo{
    public static void main(String[] args) {
        Supplier<Integer> oneDigitRandom = () -> {
           Random random = new Random();
           return random.nextInt(10);
        };
        for (int i = 0; i < 5; i++) {
           IO.println( oneDigitRandom.get());
        }
     }
}

