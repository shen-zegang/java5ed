package com.boda.xy;
import java.util.function.Predicate;
public class Program02 {
   public static void main(String[] args) {   
	   Predicate<Integer> primeNumber = (number) -> {
		   boolean isPrime = true;
		   for(int divisor = 2; divisor < number; divisor ++){
               if(number % divisor ==0){
                 isPrime = false;
                 break;
               }
           }
           return isPrime;
      };
    
      for(var n = 2; n <=1000;n++) {
    	  if(primeNumber.test(n)) {
    		  System.out.print(n + "  ");  
    	  }
      }
   }
}

