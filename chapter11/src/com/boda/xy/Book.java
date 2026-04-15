package com.boda.xy;
import java.io.Serializable;
public record Book(
		int id ,String name, String author, double price, String press) 
   implements Serializable,Comparable<Book>{
   
	public int compareTo(Book book) {
		if(id < book.id()) {
			return -1;
		}else if(id > book.id()) {
			return 1;
		}else {
			return 0;
		}
	}
}
