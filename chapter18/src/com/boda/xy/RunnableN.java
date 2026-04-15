package com.boda.xy;

public class RunnableN implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            IO.println(Thread.currentThread().getName() + " = " + i);
//            try {
//                // 使当前线程睡眠一段时间
//                Thread.sleep((int) (Math.random() * 100));
//            } catch (InterruptedException e) {
//            }
        }
        IO.println(Thread.currentThread().getName() + "  到达终点");
    }
}