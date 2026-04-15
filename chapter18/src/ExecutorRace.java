
class Task implements Runnable{
    String name;
    public Task() {}
    public Task(String name) {
        this.name = name;
    }
    public void run(){
        for(var i = 0; i < 100; i ++){
            Thread.currentThread().setName(name);
            IO.println(
                    Thread.currentThread().getName()+" ... "+i);
            try{
                // 让当前线程睡眠一段时间
                Thread.sleep((int)(Math.random() * 10));

            }catch(InterruptedException e){}
        }
        IO.println(Thread.currentThread().getName()+ "  到达终点");
    }
}
void main() {
        Task[]  task = new Task[8];
        Executor executor = Executors.newFixedThreadPool(8);
        for(int i = 0; i < 8; i++) {
            task[i] = new Task("P"+i);
            executor.execute(task[i]);
        }

}
