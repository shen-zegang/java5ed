package com.boda.xy;
import java.io.IOException;
public class ThreeExceptionDemo {
   public static void methodA(){
	   methodB();
   }

   public static void methodB() {
	   methodC();
   }

   public static void methodC(){
	  System.out.println(5 / 0);;
   }

	public static void main(String[] args) {
		methodA();
	}
}
