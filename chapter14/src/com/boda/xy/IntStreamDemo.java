package com.boda.xy;
import java.util.stream.IntStream;
public class IntStreamDemo {
	public static void main(String[] args) {
		int[] nums = new int[1000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (100 + Math.random() * 900);
		}
		IntStream intStream = IntStream.of(nums);
		intStream = intStream.filter(n -> (n % 7 == 0 || n / 100 == 7 || n % 10 == 7 || n / 10 % 10 == 7));
		int[] result = intStream.toArray();
		for (int n : result) {
			System.out.println(n);
		}
		System.out.println("满足条件数的个数=" + result.length);
		// intStream.forEach(System.out::println);
		// long count = intStream.count();
		// System.out.println(count);
	}
}
