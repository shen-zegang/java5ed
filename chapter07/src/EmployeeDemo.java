import com.boda.xy.Employee;

void main() {
	Employee emp = new Employee(101,"刘明", 30, 5000);
	Employee emp2 = new Employee(101,"刘明", 30, 5000);
	IO.println(emp.equals(emp2));
	IO.println(emp.hashCode());
	IO.println(emp2.hashCode());
	IO.println(emp==emp2);
	//IO.println(emp);
	//IO.println(emp.hashCode());
	//IO.println(emp2.hashCode());
}
