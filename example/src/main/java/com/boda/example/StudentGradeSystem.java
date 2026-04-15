package com.boda.example;

import java.util.Scanner;

public class StudentGradeSystem {
    private static final String FILENAME = "students.txt";
    private static GradeManager gradeManager;

    public static void main(String[] args) {
        gradeManager = new GradeManager();
        loadData();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String menu ="""
            1. 添加学生
            2. 删除学生
            3. 修改成绩
            4. 显示成绩
            5. 生成报表
            6. 退出""";
            System.out.println(menu);
            System.out.print("请输入选择: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1 -> {  // 添加学生
                    System.out.print("输入学生姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("输入学号ID: ");
                    String studentId = scanner.nextLine();
                    try {
                        gradeManager.addStudent(name, studentId);
                        System.out.println("学生添加成功!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {  // Remove Student
                    System.out.print("请输入学号: ");
                    String studentId = scanner.nextLine();
                    gradeManager.removeStudent(studentId);
                    System.out.println("学生已删除！");
                }
                case 3-> {  // 修改成绩
                    System.out.print("请输入学号: ");
                    String studentId = scanner.nextLine();
                    System.out.print("请输入课程名: ");
                    String course = scanner.nextLine();
                    System.out.print("请输入成绩: ");
                    double grade = scanner.nextDouble();
                    gradeManager.updateGrade(studentId, course, grade);
                }
                case 4 -> {  // 显示成绩
                    System.out.print("请输入学号: ");
                    String studentId = scanner.nextLine();
                    gradeManager.displayStudentGrades(studentId);
                }
                case 5 -> {  // 生成报表
                    gradeManager.generateReport();
                }
                case 6 -> {  // 退出
                    saveData();
                    System.out.println("数据已保存。退出...");
                    scanner.close();
                    return;
                }
            }
        }
    }

    // 加载数据
    private static void loadData() {
        gradeManager.getAllStudents().putAll(FileUtils.loadStudentsFromFile(FILENAME));
    }

    // 保存数据
    private static void saveData() {
        FileUtils.saveStudentsToFile(gradeManager.getAllStudents(), FILENAME);
    }
}

