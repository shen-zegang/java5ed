package com.boda.xy;

public class Node<T> {
   private T data;
   public Node() {}

   public Node(T data) {
	   this.data = data;
   }

   public T getData() {           // 访问方法定义
        return data;
   }

   public void setData(T data) {
	   this.data = data;
   }

   public void showType() {
	  IO.println("T的类型是:" + data.getClass().getName());
   }
}
