package com.boda.xy;
import java.util.Date;
public class DeprecatedDemo{
	@Deprecated
	public void badMethod(){
	     IO.println("Deprecated");
	}
	
	public static void main(String[]args){
		Date d = new Date(2017,10,30);
		IO.println(d.getMonth());
		IO.println(d.getYear());
		
		DeprecatedDemo dd = new DeprecatedDemo();
	    dd.badMethod();
    }
}
