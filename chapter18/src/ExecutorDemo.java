void main() {
    Runnable hellos = () -> {
        for (int i = 1; i <= 100; i++)
            System.out.println("hello " + i);
    };
    Runnable goodbyes = () -> {
        for (int i = 1; i <= 100; i++)
            System.out.println("goodbye " + i);
    };
    // 创建线程执行器对象
    Executor executor = Executors.newCachedThreadPool();
    executor.execute(hellos);
    executor.execute(goodbyes);
}

