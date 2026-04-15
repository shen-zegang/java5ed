public class Student{
    int id;
    String name;
    double [] grades;

    public Student(int id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }
}
void main() {
    Student[] students = new Student[3];
    students[0] = new Student(101, "张三", new double[]{87,78,92});
    students[1] = new Student(103, "李四", new double[]{76,85,98,70});
    students[2] = new Student(102, "王五", new double[]{65,78,94});
    for (Student stud : students
    ) {
        double total = 0.0;
        for (double grade: stud.getGrades()) {
            total = total + grade;
        }
        IO.println(stud.getName() + "   总成绩：" + total);
    }
}

