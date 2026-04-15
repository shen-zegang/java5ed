package com.boda.xy;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import com.boda.utils.MathUtils;
import com.boda.utils.MathUtils;
public class Test2 {


    void main() {

        for (int i = 1; i <= 1000; i++) {
            if(MathUtils.isPalindrome(i)&&MathUtils.isPrime(i))
                IO.println("i = " + i);
        }
    }

}
