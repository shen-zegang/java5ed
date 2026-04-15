package com.boda.xy;

public class WrapperDemo {
    public static void main(String[] args) {
        double d = Double.parseDouble("3.14m159");

        IO.println(d);   // 输出：NaN，表示不是一个数（Not a Number）


    }
}
