package com.boda.xy;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.stream.Stream;
record Employee(String name,LocalDate birthday ) {
}
public class StreamMapDemo {
	public Employee[] getEmployees() {
		Employee[] employees = { new Employee("张", LocalDate.of(2004, Month.JANUARY, 1)),
				new Employee("王", LocalDate.of(2005, Month.DECEMBER, 25)),
				new Employee("李", LocalDate.of(2000, Month.JULY, 4)),
				new Employee("赵", LocalDate.of(2005, Month.SEPTEMBER, 1)) };
		return employees;
	}

	public double calculateAverageAge(Employee[] employees) {
		LocalDate today = LocalDate.now();
		Stream<Employee> stream = Stream.of(employees);
		Stream<Period> periods = stream.map((employee) -> Period.between(employee.birthday(), today));
		double avgAge = periods.mapToLong((period) -> period.toTotalMonths()).average().getAsDouble() / 12;
		return avgAge;
	}

	public static void main(String[] args) {
		StreamMapDemo demo = new StreamMapDemo();
		Employee[] employees = demo.getEmployees();
		double avgAge = demo.calculateAverageAge(employees);
		System.out.printf("员工平均年龄:%2.2f\n", avgAge);
	}
}
