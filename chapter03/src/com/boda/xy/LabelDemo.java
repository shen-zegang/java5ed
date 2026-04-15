package com.boda.xy;

public class LabelDemo{
   public static void main(String[] args){
      outer:
      for(int i = 0; i < 3; i++){
         IO.println("i = "+i);
         inner:
         for(int j = 0; j < 100; j++){
           if(j == 20){
              break outer;}
           if(j % 3 ==0){
              continue inner; }
           IO.print(j + "  ");
         }
         IO.println("This will not be print.");
      } 
     IO.print("\n");
     IO.println("ѭ������");
  }
}

