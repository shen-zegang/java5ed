package com.boda.xy;

public class Outer4{
	 private String x = "hello";
	 public void makeInner(int param){
		 final String y = "局部变量";
		 class Inner4{     
		    public void seeOuter(){
	    	    IO.println("x = " + x);
IO.println("y = " + y);
IO.println("param = " + param);
		    }
		 }
       new Inner4().seeOuter();   
	 }
	 public static void main(String[] args){
Outer4 oc = new Outer4();
oc.makeInner(47);
	 }
}
