package com.boda.xy;
import java.util.*;
public class MapDemo2 {
   public static void main(String[] args) {
      String[] country={"China","India","Australia",
                                "Germany","Cuba","Greece","Japan"};
      String[] capital={"北京","新德里","堪培拉","柏林",
                                   "哈瓦那","雅典","东京"};
      var map = new HashMap<String, String>();
      for(var i = 0;i<country.length;i++){
         map.put(country[i], capital[i]);
      }
      System.out.println("共有 " + map.size() + " 个国家:");
      System.out.println(map);
      System.out.println(map.get("China"));
      
      for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); ){
    	    if (it.next().equals("Japan")) {
    	    	it.remove();
    	    }
    	        
    	}
      System.out.println(map);
   }
}

