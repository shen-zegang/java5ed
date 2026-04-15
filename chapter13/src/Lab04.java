import com.boda.xy.Student;

void main(String args[])
        throws IOException, ClassNotFoundException {
    Student student = new Student(20220101, "张大海", 20);
    String major = null;
    // 实现对象序列化
    FileOutputStream fout = new FileOutputStream("student.dat");
    ObjectOutputStream sout = new ObjectOutputStream(fout);
    sout.writeObject(student);
    sout.writeObject("计算机科学与技术");
    sout.close();
    student = null;
    // 实现对象反序列化
    FileInputStream fin = new FileInputStream("student.dat");
    ObjectInputStream sin = new ObjectInputStream(fin);
    while (true) {
        try {
            student = (Student) sin.readObject();
            major = (String) sin.readObject();
        } catch (EOFException e) {
            break;
        }
        System.out.println("学号 = " + student.id);
        System.out.println("姓名 = " + student.name);
        System.out.println("年龄 = " + student.age);
        System.out.println("专业 = " + major);
    }
    sin.close();
    fin.close();
}

