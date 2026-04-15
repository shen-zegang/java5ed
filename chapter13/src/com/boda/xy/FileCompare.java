package com.boda.xy;

import java.io.*;
public class FileCompare{
   public static void main(String args[])throws IOException{
     if(args.length<2){
       IO.println("Usage:FileCompare file1 file2.");
       return;
     }
     File f1 = new File(args[0]);
     File f2 = new File(args[1]);
     if(f1.length()!=f2.length()){
     	IO.println("The 2 Files is not equal.");
     	System.exit(0);
     }
     FileInputStream fis1 = new FileInputStream(f1);
     FileInputStream fis2 = new FileInputStream(f2);
     int b1,b2;
     while((b1 = fis1.read())!=-1 &&(b2 = fis2.read())!=-1){
       if(b1!=b2){
       	 IO.println("The 2 Files is not equal.");
       	 break;
       }
     }
     IO.println("The 2 Files is equal.");
   }
}

