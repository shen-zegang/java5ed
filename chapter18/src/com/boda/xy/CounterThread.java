package com.boda.xy;

public class CounterThread extends Thread{
    public CounterThread(String name){
        super(name);
    }
    public void run(){
        int count = 0;
        while (true){
            try {
                sleep(1);         // 睡眠10毫秒
            }catch (InterruptedException e){}
            if(count == 1000)
                break;
            IO.println(getName() + ":" + count++);
        }
    }

    static void main() {
       CounterThread t1 = new CounterThread("Runner-A");
       CounterThread t2 = new CounterThread("Runner-B");
       t1.setPriority(1);
       t2.setPriority(10);
       t1.start();
       t2.start();
    }
}
