package com.boda.xy;

//import java.time.LocalDate;

import module java.base;
import module java.sql;

public class Test {

	public static void main(String[] args) {
		String s = "ABC";
		IO.println(s.codePointAt(0));
		var  joined = String.join("\\","C:","javastudy","com");
	    IO.println(joined);              //  输出C:\javastudy\com
        IO.println(LocalDate.now());

	}

}
