package com.boda.xy;

import java.util.Objects;

public class Employee extends Person {
    public int id;
    public double salary;   // 表示员工工资
   // 无参构造方法
   public Employee(){
   }
   // 带一个参数构造方法
   public Employee(double salary){
     this.salary = salary;
   }
   // 带3个参数构造方法
   public Employee(int id,String name, int age, double salary){
     super(name,age);
     this.salary = salary;
     this.id = id;
   }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            return this.id == ((Employee) obj).getId();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(),getAge(), salary);
    }

    @Override
    public String toString(){
        return  "员工信息:" + getName()+ "  " + getAge() +"  "+  salary;
    }

    public void sayHello(){
        IO.println("我叫 " + getName() + ",今年 " + getAge() + "岁");
        IO.println("我的工资是： " + salary);
    }

    public double computeSalary(int hours, double rate) {
    	double totalSalary;
    	totalSalary = this.salary + hours * rate; 
    	return totalSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
