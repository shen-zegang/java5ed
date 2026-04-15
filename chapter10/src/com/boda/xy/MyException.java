package com.boda.xy;
public class MyException extends Exception{
    private int num;
    MyException(int a){
       num = a;
    }
    public String toString(){
       return "MyException["+num+"]";
    }
}
