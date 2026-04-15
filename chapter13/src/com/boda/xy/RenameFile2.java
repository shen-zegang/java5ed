package com.boda.xy;

import java.io.*;
import java.nio.file.*;
public class RenameFile2{
   public static boolean renameFile(Path path1,Path path2)
        throws NoSuchFileException,FileAlreadyExistsException{
	   if(Files.notExists(path1)){
		  throw new NoSuchFileException(path1.toString()); 
	   }
	   if(Files.exists(path2)){
			  throw new FileAlreadyExistsException(path2.toString()); 
	   }
	   try{
		   Files.copy(path1, path2,StandardCopyOption.COPY_ATTRIBUTES);
		   Files.delete(path1);
		   return true;
	   }catch(IOException e){
		   e.printStackTrace();
		   return false;
	   }
    }
	public static void main(String args[]){
       Path source = Paths.get("D:\\study\\debug.txt");
       Path target = Paths.get("D:\\study\\backup.txt");
       try{
    	    if(renameFile(source,target)){
    		  IO.println("Rename File Successful.");
    	    }else{
    		 IO.println("Rename File Error.");
    	    }
      }catch(IOException e){
    	     e.printStackTrace();
      }
   }
}
