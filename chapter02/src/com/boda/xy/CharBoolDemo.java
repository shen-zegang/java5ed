package com.boda.xy;
public class CharBoolDemo{
    public static void main(String[] args){
       boolean b;
       char ch1,ch2;
       ch1 = 'Y';
       ch2 = 65 ;               // 可以将一个整数值赋给字符型变量
       System.out.println("ch1 = "+ch1+",ch2 = "+ch2);
       b = ch1==ch2;            
       System.out.println(b);
       ch2 ++;                   // 字符型数据可以执行自增运算
       System.out.println("ch2="+ch2);  
}
}

