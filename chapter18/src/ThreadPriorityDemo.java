class CounterThread extends Thread{
	    
       public void run(){
   	     int count = 0 ;
   	     while(true){
   		    try{
   			   sleep(1);
   		   }catch(InterruptedException e){}
   		   if(count ==5000)
   			  break; 
   		   System.out.println(getName()+":"+count++);
   	     }
   	   }
	}
	
void main() {
		CounterThread thread1 = new CounterThread();
		CounterThread thread2 = new CounterThread();
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread1.start();
		thread2.start();

}

