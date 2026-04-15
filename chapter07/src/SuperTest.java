public class Employee extends Person{
    String department;
    Employee(String name, int age, String department){
        if(age < 18 || age > 67){
            throw new IllegalArgumentException("员工年龄必须在18-67之间");
        }
        this.department = department;
        super(name,age);
        IO.println("新员工 " + name + "已加入 " + department + "部门");
    }
}
void main(){
    Employee smith = new Employee("Smith",30,"信息部");
    smith.sayHello();
}

