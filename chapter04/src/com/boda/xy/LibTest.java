package com.boda.xy;

import static com.boda.utils.MathUtils.isPalindrome;
import static com.boda.utils.MathUtils.isPrime;

public class LibTest {
    public static void main(String[] args) {
        int count = 0;
        for(var n = 2; n <=1000; n++){
            if(isPrime(n) && isPalindrome(n)) {
                count ++;
                if(count %10 ==0){
                    System.out.printf("%5s%n",n);
                }else{
                    System.out.printf("%5s",n);
                }
            }
        }

    }
}
