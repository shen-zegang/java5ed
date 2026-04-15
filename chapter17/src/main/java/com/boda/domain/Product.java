package com.boda.domain;

public record Product (
   int id,String pname, String brand,double price, int stock){
	@Override
   public String toString() {
	   return  "编号：" + id +" 名称：" + pname + " 价格:" + price;
   }
}
