package com.boda.ab;
import java.util.Arrays;
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	public Employee() {
		this(0, "", 0);
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee e) {
		return e.age - this.age;
	}
	public static void main(String[] args) {
		Employee[] emps = { new Employee(101, "张大海", 20), new Employee(102, "王小明", 25) };
		Arrays.sort(emps);
		for (Employee e : emps) {
			IO.println(e);
		}
	}
}
