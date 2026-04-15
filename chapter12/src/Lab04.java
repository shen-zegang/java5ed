public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }
    // 实现了compareTo()方法
    public int compareTo(Employee obj) {
        return this.id - obj.id;
    }
}
void main() {
    Employee[] myList = new Employee[3];
    myList[0] = new Employee(103, "张大海");
    myList[1] = new Employee(999, "王月");
    myList[2] = new Employee(101, "李勇");
    TreeSet<Employee> empList = new TreeSet<>();
    // 按id值顺序存放
    empList.add(myList[0]);
    empList.add(myList[1]);
    empList.add(myList[2]);
    for (Employee emp : empList) {
        System.out.println(emp.id + "  " + emp.name);
    }
}

