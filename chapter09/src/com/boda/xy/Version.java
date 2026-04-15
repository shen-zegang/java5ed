package com.boda.xy;

public @interface Version {
   int major() default 1;
   int minor() default 0;
}
