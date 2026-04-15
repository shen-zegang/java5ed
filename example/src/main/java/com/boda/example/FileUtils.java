package com.boda.example;

import java.io.*;
import java.util.*;

public class FileUtils {
    // 保存学生数据到文件
    public static void saveStudentsToFile(Map<String, Student> students, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student student : students.values()) {
                writer.write(student.getStudentId() + ";" + student.getName());
                writer.newLine();
                for (Map.Entry<String, Double> entry : student.getAllGrades().entrySet()) {
                    writer.write(entry.getKey() + ":" + entry.getValue());
                    writer.newLine();
                }
                writer.newLine();  // 学生记录之间空一行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 从文件加载学生数据
    public static Map<String, Student> loadStudentsFromFile(String filename) {
        Map<String, Student> students = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] studentInfo = line.split(";");
                if (studentInfo.length != 2) continue;
                String studentId = studentInfo[0];
                String name = studentInfo[1];
                Student student = new Student(name, studentId);

                while ((line = reader.readLine()) != null && !line.isEmpty()) {
                    String[] courseGrade = line.split(":");
                    if (courseGrade.length == 2) {
                        String course = courseGrade[0];
                        double grade = Double.parseDouble(courseGrade[1]);
                        student.addOrUpdateGrade(course, grade);
                    }
                }

                students.put(studentId, student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}

