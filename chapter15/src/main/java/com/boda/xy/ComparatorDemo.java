package com.boda.xy;

import java.util.Arrays;
import java.util.Comparator;
public class ComparatorDemo{
    private static class LengthComparator implements Comparator<String>{ 
        @Override
public int compare(String a, String b){
            return a.length()-b.length();
        }
}
    
    public static void main(String []args){
       String[] ss = {"this", "is","a","test","string"};
       LengthComparator comp = new LengthComparator();
Arrays.sort(ss, comp);      // 对数组ss按长度排序
for(String s : ss){
            System.out.print(s + " ");
}
     }
}

