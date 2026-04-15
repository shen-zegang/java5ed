package com.boda.xy;
import java.util.Objects;
public class Employee{
   private int id;
   private String name;
   private double salary;   // 表示员工工资
   // 无参构造方法
   public Employee(){
   }
   // 带3个参数构造方法
   public Employee (int id,String name,double salary){
     this.id = id;
     this.name =name;
     this.salary = salary;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "员工信息:" + id + "  " + name +"  "+  salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
    public double computeSalary(int hours, double rate) {
    	double totalSalary;
    	totalSalary = this.salary + hours * rate; 
    	return totalSalary;
   }
}
