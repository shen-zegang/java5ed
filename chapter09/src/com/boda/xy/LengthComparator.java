package com.boda.xy;
import java.util.Comparator;
import java.util.Arrays;
public class LengthComparator implements Comparator<String>{ 
    @Override
	public int compare(String first, String second){
        return first.length()-second.length();
    }
    
    public static void main(String[] args){   
    	String[] ss = {"this", "is","a","test","string"};
    	Arrays.sort(ss, new LengthComparator());      // ������ss����������
    	for(String s : ss)
    	     IO.print(s + " ");

    }
}

