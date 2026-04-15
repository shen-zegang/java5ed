package com.boda.xy;

import java.sql.SQLException;
import java.util.ArrayList;
import com.boda.dao.*;
import com.boda.domain.Product;

public class ProductDaoDemo {
   public static void main(String[] args) {
	    var dao = new ProductDaoImpl();
	    var product = new Product(108,"5G手机","华为",3500.00,10);
	    var products = new ArrayList<Product>();
       try {
    	   //dao.addProduct(product);          // 向表中插入一行记录
    	   products = dao.findAllProduct();   // 返回表中所有记录的数组列表
      } catch (SQLException e) {
         e.printStackTrace();
      }
      // 输出商品号大于104的商品信息
      for(var p:products) {
    	  if(p.id() > 100) {
    		  System.out.println(p);
    	  }
      }
   }
}
