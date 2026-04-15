package com.boda.xy;
import java.util.Arrays;
import java.util.Comparator;
public class LambdaDemo {
	public static void main(String[] args) {
		String [] names = {"Shanghai", "Guangzhou", "Beijing", "London"};
		Arrays.sort(names, (a, b) ->b.compareTo(a) );
		
		for(String n : names) {
			IO.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		Arrays.sort(names, new Comparator<String>() {
//		    @Override
//		    public int compare(String a, String b) {
//		        return b.compareTo(a);
//		    }
//		});
//				
//        for(String n :names) {
//        	IO.println(n);
//        }
//        	
	}

}
