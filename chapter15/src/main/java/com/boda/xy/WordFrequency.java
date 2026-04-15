package com.boda.xy;
import java.util.*;
import java.io.*;

public class WordFrequency{
   public static void main(String[] args)throws IOException{   
      var tm = new TreeMap<String, Integer>();
      String [] str = {"no pains,no gains.",
    		           "well begun is half done.",
    		           "where there is a will,there is a way."};     
      for(String line : str){
    	String[] words = line.split("[ ,.]");  // 每读一行将其解析成字符串数组
        for(String s : words){
       	 Integer count = tm.get(s);   // 返回单词的数量
       	 if(count == null)             // 表示s不在m中
      	       tm.put(s,1);
         else
      	       tm.put(s,count + 1);
       }
     }
      
     System.out.println("共有" + tm.size() + "个不同单词。");
     System.out.println(tm);
    }    
}

