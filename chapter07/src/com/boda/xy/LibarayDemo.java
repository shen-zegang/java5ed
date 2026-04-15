package com.boda.xy;

import com.boda.utils.MathUtils;

public class LibarayDemo {

	public static void main(String[] args) {
		var count = 0;
		for(var n=2;n<=1000;n++) {		    
			if(MathUtils.isPrime(n)&&MathUtils.isPalindrome(n))	{
				count++;
				if(count % 10 ==0) {
		    		System.out.printf("%5s%n",n);
		    	}else {
		    		System.out.printf("%5s",n);
		    	}
		    }
		}
	}
}
