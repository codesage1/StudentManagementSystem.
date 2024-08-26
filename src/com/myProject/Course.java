package com.myProject;

import java.util.List;

public class Course {
    private final String courseName;
    private final String courseCode;
    private final Professor instructorInCharge;
    private List<Student> students;

    public Course(String courseName, String courseCode, Professor instructorInCharge) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorInCharge = instructorInCharge;
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
        System.out.println("Instructor In Charge: " + instructorInCharge);
        System.out.println("Students: " + students);
    }
}
