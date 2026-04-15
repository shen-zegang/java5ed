package com.boda.xy;

public class DeprecatedDemo{
	@Deprecated
	public void badMethod(){
	     System.out.println("Deprecated");
	  }
	   public static void main(String[]args){
	       DeprecatedDemo dd = new DeprecatedDemo();
	       dd.badMethod();
	}
}

