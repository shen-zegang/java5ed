import com.boda.xy.Employee;

void main() {
    //创建员工对象
    var emp1 =  new Employee(105, "张三",LocalDate.of(1980,12, 15), 6000);
    var emp2 =  new Employee(102, "李四",LocalDate.of(2002,8, 28), 4000);
    var emp3 =  new Employee(108, "王五",LocalDate.of(2001,10, 10), 4800);
    var emp4 =  new Employee(102, "李四",LocalDate.of(2002,8, 28), 4000);
    //将员工对象添加到HashSet集合，员工号重复的对象看作同一人，不重复添加
    Set<Employee> employeeSet=new HashSet<Employee>();
    employeeSet.add(emp1);
    employeeSet.add(emp2);
    employeeSet.add(emp3);
    employeeSet.add(emp4);
    IO.println("未排序的员工信息：");
    for(Employee emp:employeeSet) {
        IO.println(emp);
    }
    //将HashSet集合中的员工对象添加到TreeSet集合中，实现按员工号升序
    Set<Employee> employeeTreeSet=new TreeSet<Employee>(employeeSet);
    IO.println("按id号升序排序结果：");
    for(Employee emp: employeeTreeSet) {
        IO.println(emp);
    }

}