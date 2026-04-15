package com.boda.xy;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        String[] s = {"China", "England","France","America","Russia",};
        var ts = new TreeSet<String> ();
        for(var i = 0; i < s.length; i ++){
            ts.add(s[i]);
        }
        System.out.println(ts);    // 按自然顺序输出

        var ts2 = new TreeSet<String>((a,b)->b.compareTo(a));

        for(var i = 0; i < s.length; i ++){
            ts2.add(s[i]);
        }
        System.out.println(ts2);


    }
}
