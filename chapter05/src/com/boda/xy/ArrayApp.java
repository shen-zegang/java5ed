package com.boda.xy;

import java.util.Arrays;

public class ArrayApp {
    public static double sumArray(double array[]){
        var sum = 0.0;
        for(var i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] reverse(int[] list){
        int [] result = new int[list.length];  // 创建一与参数数组大小相同的数组
        for(int i = 0, j = result.length-1; i < list.length; i++ , j--){
            result[j] = list[i];   // 实现元素反转
        }
        return result;  // 返回数组
    }

    public static double average(String name,double ... values){   // 70,80,90
        var sum = 0.0;
        for(var value:values){
            sum = sum + value;   // 求数组元素之和
        }
        double average = sum / values.length;
        return average;
    }
    public static void bubbleSort(int[] a){
        for(var i = 0; i < a.length-1; i++) {
            for(var j = 0; j < a.length -i -1; j ++) {
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a [j] = a[j+1];
                    a[j+1] = t;
                }
            }
            System.out.print("第" + (i+1) + "趟结果：");
            for(var n:a) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{15,56,20,-2},
                {10,80,-9,31},
                {76,-3,99,21}};

        for(int i = 0 ; i < matrix.length; i++){
            for(int j=0 ; j < matrix[0].length;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
