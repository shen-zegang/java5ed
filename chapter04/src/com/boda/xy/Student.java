package com.boda.xy;

public class Student {
    int id = 1002;
    String name = "李明";
    double marks = 100;
    boolean pass = false;

    // 定义成员方法
    public Student(){
//        id = 1008;
//        name = "张大海";
//        marks = 87;
//        pass = true;
    }
    public void display(){
       IO.println("id = "+id);
       IO.println("name = "+name);
       IO.println("marks = "+marks);
       IO.println("pass = "+pass);
    }
    public static void main(String[] args){
       Student s = new Student();
       s.display();
   }

    {   // 初始化块
        id = 1001;
        name = "李明";
        marks = 87;
        pass = true;

    }
}
