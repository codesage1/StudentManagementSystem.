package com.myProject;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String courseName;
    private final String courseCode;
    private final Professor instructorInCharge;
    private final List<Student> students = new ArrayList<>();

    public Course(String courseName, String courseCode, Professor instructorInCharge,List<Student> students) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorInCharge = instructorInCharge;
        this.students.addAll(students);
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }



    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Instructor In Charge: " + instructorInCharge.getName());
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Id: " + student.getId());
        }
    }
}
