package com.boda.xy;

public class Singleton {
    // 私有静态变量，不立即创建实例
    private static Singleton instance = null;
    // 私有构造方法，防止外部实例化
    private Singleton() {
        IO.println("创建Singleton对象。");
    }
    // 公共静态同步方法，保证线程安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // 第一次调用时创建实例
        }
        return instance;
    }
    // 示例方法
    public void sayHello() {
        IO.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.sayHello();
        // 验证s1和s2是同一个实例
        IO.println(s1 == s2);     // 输出 true
    }
}