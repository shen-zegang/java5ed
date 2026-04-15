package com.boda.ab;
import java.util.*;
class Comp implements Comparator<Student>{
  public int compare(Student s1, Student s2){
    if(s1.name.compareTo(s2.name)<0)
      return -1;
    else if(s1.name.compareTo(s2.name)>0)
      return 1;
    else return 0;
  }
}
public class Student implements Comparable<Student>{
  int id;
  String name;
  public Student(int id,String name){
    this.id=id;
    this.name=name;
  }
  public int compareTo(Student o){
     Student s = (Student)o;
     return ((this.id<s.id)?-1:(this.id==s.id?0:1));
  }
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
  
  public static void main(String args[]){
      Student[] stud = new Student[]{
         new Student(1002,"王小明"),
         new Student(1003,"张大海"),
         new Student(1001,"周丽丽")};
      Arrays.sort(stud, new Comp());
	  for(Student s:stud){
	    	IO.println(s);	
	 }	    		     
  }
}
