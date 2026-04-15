package com.boda.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentId;
    private String name;
    private Map<String, Double> courses;  // 课程名称和成绩的映射

    // 构造函数
    public Student(String studentId, String name) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new HashMap<>();
    }

    // 获取学生的姓名
    public String getName() {
        return name;
    }

    // 获取学生的学号
    public String getStudentId() {
        return studentId;
    }

    // 添加或修改课程成绩
    public void addOrUpdateGrade(String course, double grade) {
        courses.put(course, grade);
    }

    // 获取课程成绩
    public Double getGrade(String course) {
        return courses.get(course);
    }

    // 获取所有课程成绩
    public Map<String, Double> getAllGrades() {
        return courses;
    }

    // 获取学生的平均成绩
    public double getAverageGrade() {
        double total = 0;
        for (Double grade : courses.values()) {
            total += grade;
        }
        return courses.isEmpty() ? 0 : total / courses.size();
    }

    // 返回学生信息
    @Override
    public String toString() {
        return "姓名: " + name + ", 学号: " + studentId + ", 课程: " + courses;
    }
}

