package com.boda.xy;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        Counter c2 = new Counter();
        IO.println(c1.x);    // 100
        IO.println(Counter.y);    // 2

        IO.println(c2.x);    // 100
        IO.println(Counter.y);    // 2

    }
}
