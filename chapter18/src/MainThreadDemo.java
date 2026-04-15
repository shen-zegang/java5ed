void main() {
    Thread t = Thread.currentThread(); // 返回当前线程对象
    IO.println(t);
    IO.println(t.getName());
    t.setName("MyThread");
    IO.println(t);
} 
