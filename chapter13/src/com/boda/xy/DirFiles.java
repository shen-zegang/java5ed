package com.boda.xy;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirFiles{
    public static void main(String[] args){
 	   Path path = Paths.get(args[0]);
 	   try (
 		   DirectoryStream<Path> children = 
 		        Files.newDirectoryStream(path)){
 		   for(Path child:children){
 			   IO.println(child.toString());
 		   }
 	   }catch (IOException e) {
 		    e.printStackTrace();
 		} 
    }
}

