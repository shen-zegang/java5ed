class Task implements Runnable{
  public void run(){
    for(var i = 0; i < 100; i ++){ 
//       System.out.println(
//               Thread.currentThread().getName()+" ... "+i);
       try{
          // 使当前线程睡眠一段时间
          Thread.sleep((int)(Math.random() * 10));
       }catch(InterruptedException e){}	
    }
    System.out.println(Thread.currentThread().getName()+ "  到达终点");
  }
}

void main(String[] args) {
	    Task  task = new Task();
	    Thread [] player = new Thread[8];
	    for(int i = 0; i < 8; i++) {
	    	player[i] = new Thread(task, "P"+i);
	    	player[i].start();
	    }
}

