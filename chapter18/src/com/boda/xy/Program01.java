package com.boda.xy;

public class Program01{
    public static void main(String[] args){
       Runnable task = ()->{
    	     for(int i = 0; i < 100; i ++){ 
    	        System.out.println(
    	                 Thread.currentThread().getName()+" = "+i);
    	        try{
    	            // 使当前线程睡眠一段时间
    	           Thread.sleep((int)(Math.random() * 100));
    	        }catch(InterruptedException e){}	
    	      }
    	      System.out.println(Thread.currentThread().getName()+ "  结束");
       };
       Thread t1 = new Thread(task, "线程 A");
       Thread t2 = new Thread(task ,"线程 B");
       t1.start();
       t2.start();
    }
}

