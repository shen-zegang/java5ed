package com.boda.xy;
import java.util.function.Predicate;
public class PredicateDemo {
   public static void main(String[] args) {
      Predicate<String> numbersOnly = (input) -> {
        for (int i = 0; i < input.length(); i++) {
          char c = input.charAt(i);
          if ("0123456789".indexOf(c) == -1) {
             return false;
        }
     }
       return true;
    };
    IO.println(numbersOnly.test("12345")); 
     IO.println(numbersOnly.test("100a"));  
   }
}

