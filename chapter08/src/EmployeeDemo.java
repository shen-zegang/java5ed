import com.boda.xy.Employee;

void main() {
    var employee1 = new Employee(101,"刘明",5000);
    var employee2 =  employee1;
    var employee3 = new Employee(101,"刘明",5000);
    IO.println(employee1.equals(employee2));        // 输出：true
    IO.println(employee1.equals(employee3));        // 输出：true
    IO.println(employee1.hashCode());       // 输出：1106640718
    IO.println(employee2.hashCode());       // 输出：1106640718
    IO.println(employee3.hashCode());       // 输出：1106640718


}