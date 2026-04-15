package com.boda.xy;
import java.util.List;
import java.util.Arrays;
public class MethodReferenceDemo2 {
	public static void main(String[] args) {
       String[] names = {"one","ONE","two","TWO"};
       Arrays.sort(names, String::compareToIgnoreCase);
	   
       for(String n:names) {
    	   IO.println(n);
       }
	}
}
