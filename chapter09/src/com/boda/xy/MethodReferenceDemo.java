package com.boda.xy;
import java.util.List;
import java.util.Arrays;
public class MethodReferenceDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","four");
		list.forEach(x->IO.println(x));

	}

}
