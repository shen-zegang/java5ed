package com.boda.xy;

public final class Sun{
    private static final Sun INSTANCE = new Sun();
    private int a = 0;
    private Sun(){}
    public static synchronized Sun getInstance(){
        return INSTANCE;
    }
    public void methodA(){
        a ++;
        IO.println("a = " + a);
    }
    public static void main(String[] args){
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        sun1.methodA();
        sun2.methodA();
        IO.println(sun1==sun2);     // 输出：true
    }
}

