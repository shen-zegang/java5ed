package com.boda.utils;
import java.util.Scanner;
public class Input {
    static Scanner input = new Scanner(System.in);
    public static double readInt() {
        int n = input.nextInt();
        return n;
    }
    public static double readDouble() {
        double n = input.nextDouble();
        return n;
    }
    public static String readString() {
        String s = input.nextLine();
        return s;
    }
}


