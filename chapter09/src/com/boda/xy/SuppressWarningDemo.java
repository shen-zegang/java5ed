package com.boda.xy;
import java.io.Serializable;
import java.util.*;
@SuppressWarnings(value={"serial","deprecation"})
public class SuppressWarningDemo implements Serializable {
	 public static void main(String[] args) {
       Date d = new Date(2017,10,30);
       IO.println(d.getMonth());
       
       IO.println(d);
	 }
}

