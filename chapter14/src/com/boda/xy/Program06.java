package com.boda.xy;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
public class Program06{
   // 计算n的阶乘
   public static BigInteger factorial(long n){
	     BigInteger result = BigInteger.ONE;  // BigInteger.ONE常量，表示1
	     for (long i = 1; i <= n; i++){
	        result = result.multiply(new BigInteger(i+""));
	     }
	  return result;
	}

   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
      Instant start = Instant.now();    // 记录开始时间
      numbers.parallelStream().map((input) -> factorial(input))
            .forEach(System.out::println);
      Instant end = Instant.now();       // 记录结束时间
      System.out.printf("使用并行流用时: %d毫秒\n",
               Duration.between(start, end).toMillis());
      start = Instant.now();
      numbers.stream().map((input) -> factorial(input))
             .forEach(System.out::println);
      end = Instant.now();
      System.out.printf("使用顺序流用时: %d毫秒\n",
               Duration.between(start, end).toMillis());
      }
  }
