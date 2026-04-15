class RunnableN implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            IO.println(Thread.currentThread().getName() + " = " + i);
            try {
                // 使当前线程睡眠一段时间
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
        IO.println(Thread.currentThread().getName() + "  到达终点");
    }
}
void main() {
    RunnableN task = new RunnableN();
    Thread t1 = new Thread(task, "运动员 A");
    Thread t2 = new Thread(task ,"运动员 B");
    Thread t3 = new Thread(task ,"运动员 C");
    t1.start();
    t2.start();
    t3.start();
}