package com.boda.ab;
public class OuterClass{
	 private Integer x = 100;	 
	 public void makeInner(int param){
		 String s = "Hello World";
		 class InnerClass{     // 局部内部类
		    public void show(){
	    	    //param = param + 5;
	    	    // s = s + "AB";
	    	    x = x + 100;
		    	IO.println("x = " + x);  // 访问外部类的成员
                IO.println("s = " + s);  // 访问局部变量
                IO.println("param = " + param);  // 访问参数
		    }
		 }
        new InnerClass().show();   
	 }
	 public static void main(String[] args){
       OuterClass oc = new OuterClass();
       oc.makeInner(47);
	 }
}

