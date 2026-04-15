package com.boda.xy;
public @interface Enhancement {
	int id();
	String synopsis();
	String engineer() default "unsigned";
	String date() default "unknown";
}

