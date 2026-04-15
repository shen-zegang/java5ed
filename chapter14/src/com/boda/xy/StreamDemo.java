package com.boda.xy;
import java.util.stream.*;
import java.util.Arrays;
import java.util.*;
public class StreamDemo {
	public static void main(String[] args) {
		String[] words = {"this", "is", "a", "java", "string"};
		Stream<String> stream = Stream.of(words);
		Optional<String> result  = stream.max(String::compareTo);
	 					
		System.out.println(result.orElse(""));
		
	}
}
