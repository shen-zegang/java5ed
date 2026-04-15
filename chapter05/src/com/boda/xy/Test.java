package com.boda.xy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args)throws IOException {	     
		var stream1 = Stream.of("北京","上海");
		var stream2 = Stream.of("Sydney", "London", "Paris");
		Stream.concat(stream1, stream2).sorted().
		forEach(s->System.out.println(s));

	}

}
