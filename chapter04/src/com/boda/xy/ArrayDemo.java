package com.boda.xy;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] source  = {10,30,20,40};                      // 源数组
        int [] target = new int[source.length];            // 目标数组

        target = source;

        //System.arraycopy(source,1,target,0,2);

       for(int n = 0 ; n < target.length ;n++){
            IO.print(target[n] + "  ");
        }
    }
}
