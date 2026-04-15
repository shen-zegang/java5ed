package com.boda.xy;
import java.util.*;
public class BoundedTypeDemo {
   public static double getAverage(List<? extends Number> numberList){
	    var total = 0.0;
	    for(var number :numberList){
		    total += number.doubleValue();
	    }
	    return total/numberList.size();
   }
   
   public static void main(String[] args) {
	     String[] s = {"China", "England","France","America","Russia",};
	     var ts = new TreeSet<String> ();
	     for(var i = 0; i < s.length; i ++){
	         ts.add(s[i]);
	     }
	     System.out.println(ts);
	     
	     // 使用匿名内部类实现字符串倒序排序
	     ts = new TreeSet< String >(
	new Comparator<String>(){
	@Override
	public int compare(String a,String b){
	    return b.compareTo(a);
	}
	}); 
	     // 将数组s中元素添加到TreeSet对象中
	     for(var i = 0; i < s.length; i ++){
	          ts.add(s[i]);
	     }
	     System.out.println(ts);


	}
}
