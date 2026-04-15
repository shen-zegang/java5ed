public class Employee implements Serializable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

void main(String args[])
        throws IOException, ClassNotFoundException {
    Employee emp = new Employee(201, "Liu Ming", 2000);
    Employee emp2 = new Employee(202, "Zhang Qiang", 3000);
    // 实现对象序列化
    FileOutputStream fout = new FileOutputStream("employee.ser");
    ObjectOutputStream sout = new ObjectOutputStream(fout);
    sout.writeObject(emp);
    sout.writeObject(emp2);
    sout.close();
    emp = null;
    // 实现对象反序列化
    FileInputStream fin = new FileInputStream("employee.ser");
    ObjectInputStream sin = new ObjectInputStream(fin);
    while (true) {
        try {
            emp = (Employee) sin.readObject();
        } catch (EOFException e) {
            break;
        }
        System.out.println("id = " + emp.id);
        System.out.println("name = " + emp.name);
        System.out.println("salary = " + emp.salary);
    }
    sin.close();
    fin.close();
}

