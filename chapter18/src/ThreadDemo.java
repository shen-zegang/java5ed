class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }

    public void run() {
        for (var i = 0; i < 100; i++) {
            IO.println(getName() + " = " + i);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
        IO.println(getName() + "  到达终点");
    }
}

void main() {
    Thread t1 = new ThreadDemo("运动员 A");
    Thread t2 = new ThreadDemo("运动员 B");
    t1.start();
    t2.start();
}
