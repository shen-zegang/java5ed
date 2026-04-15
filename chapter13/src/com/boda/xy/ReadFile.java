package com.boda.xy;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class ReadFile{
    public static void main(String[] args){
 	   Path path = Paths.get("D:\\study\\speech.txt");
 	   Charset charset = Charset.forName("UTF-8");
 	   List<String> linesRead = null;
 	   try {
 		   if(Files.notExists(path)){
 			   throw new NoSuchFileException("File does not exists.");
 		   }
 		   linesRead = Files.readAllLines(path,charset);
 	   }catch (IOException e) {
 		    e.printStackTrace();
 		} 
 	   if(linesRead !=null){
 		   for(String line:linesRead){
 			   IO.println(line);
 		   }
 	   }
    }
}

