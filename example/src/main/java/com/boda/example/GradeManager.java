package com.boda.example;

import java.util.*;

public class GradeManager {
    private Map<String, Student> students;  // 存储学号与学生对象的映射

    public GradeManager() {
        students = new HashMap<>();
    }

    // 添加学生
    public void addStudent(String name, String studentId) throws IllegalArgumentException {
        if (students.containsKey(studentId)) {
            throw new IllegalArgumentException("Student ID already exists!");
        }
        students.put(studentId, new Student(name, studentId));
    }

    // 删除学生
    public void removeStudent(String studentId) {
        students.remove(studentId);
    }

    // 修改学生成绩
    public void updateGrade(String studentId, String course, double grade) {
        Student student = students.get(studentId);
        if (student != null) {
            student.addOrUpdateGrade(course, grade);
        }
    }

    // 查询学生成绩
    public void displayStudentGrades(String studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("没有找到学生！");
        }
    }

    // 生成成绩统计报告
    public void generateReport() {
        double highestGrade = Double.MIN_VALUE;
        double lowestGrade = Double.MAX_VALUE;
        double totalGrade = 0;
        int count = 0;
        for (Student student : students.values()) {
            double avg = student.getAverageGrade();
            highestGrade = Math.max(highestGrade, avg);
            lowestGrade = Math.min(lowestGrade, avg);
            totalGrade += avg;
            count++;
        }

        double average = (count == 0) ? 0 : totalGrade / count;
        System.out.println("平均成绩: " + average);
        System.out.println("最高成绩: " + highestGrade);
        System.out.println("最低成绩: " + lowestGrade);
    }

    // 返回所有学生
    public Map<String, Student> getAllStudents() {
        return students;
    }
}

