import com.boda.xy.Employee;

public void change(int num){
    num  = num * 2;
    IO.println(num);     // 输出：200
}

public void change(Employee emp){
    emp.setSalary(8000); // 在方法体中修改emp的工资
    IO.println(emp.getSalary());    // 输出：8000
}

void main(){
   int number = 100;
   change(number);
   IO.println(number);     // 输出：100
   Employee employee = new Employee();
   employee.setSalary(5000);
   change(employee);
    // 方法调用后输出员工的工资
   IO.println(employee.getSalary());    // 输出：8000
}

