class MyTimer implements Runnable{  // 内部类
      boolean flag = true;        // 定义一个标志变量
      public void run(){
         while(flag){              // 通过flag变量控制线程结束
           System.out.println(""+LocalTime.now()+"...");
           try{
             Thread.sleep(1000); 
           }catch(InterruptedException e){}	
         }
        System.out.println(""+Thread.currentThread().getName()+" 结束");
    }
    public void stopRun(){
         flag = false;        // 将标志变量设置为false
    }
}//内部类结束
void main(){
     MyTimer timer = new MyTimer();
     Thread thread = new Thread(timer);	
     thread.setName("Timer");
     thread.start();
     for(int i = 0;i < 100;i++){
        System.out.println(i);
        try{
          Thread.sleep(100);
        }catch(InterruptedException e){}	
     }
     timer.stopRun();  // 使用户线程结束
}
