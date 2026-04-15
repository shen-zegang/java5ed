package com.boda.xy;

public class StaticDemo {
    int n = 200;
    static int x = 100;



    public StaticDemo(){
        x = 88;
    }
    //其他代码
    public static void main(String[] args) {
        IO.println(StaticDemo.x);  // 48
        StaticDemo  sd = new StaticDemo();
        IO.println(StaticDemo.x);   // 88
        IO.println(sd.x);   // 88

    }

    static    //静态初始化块
    {
        //    n = 300;
        x = 48;
    }
}
