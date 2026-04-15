import com.boda.xy.Employee;

void main(){
        Employee employee = new Employee("张明月",20,3000);
//        employee.name = "李明";
//        employee.age = 28;
//        employee.salary = 5000.00;

        IO.println("姓名 = " + employee.name);
        IO.println("年龄 = " + employee.age);
        IO.println("工资 = " + employee.salary);
        employee.sayHello();
}
