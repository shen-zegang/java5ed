package com.boda.xy;

public class SelectionSort {
    public static void selectionSort(int[]array){
      for(var i = 0;i < array.length-1; i++){
         for(var j = i + 1;j < array.length; j++){
            if(array[i] > array[j]){
  	            int temp = array[j];
  	            array[j] = array[i];
  	            array[i] = temp;
  	         }
  	      }
  	   }
    }
    public static void main(String[]args){
        int[] marks = {78,65,80,67,92,84};
        selectionSort(marks);
        for(var n: marks){
             System.out.print(n+"  ");
        }
   }
}

