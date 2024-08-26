package com.myProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student extends Person {

    // want at max 5 courses,will see later.
    private final List<Course> coursesEnrolled = new ArrayList<>(5);
    private Map<Course, Double> grades;

    public Student(String name, String id, int age) {
        super(name, id, age);
    }
    public Student(String name, String id, int age, List<Course> coursesEnrolled) {
        super(name, id, age);
        this.coursesEnrolled.addAll(coursesEnrolled);
    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }

    public void addGrade(Course course, Double grade){
        grades.put(course, grade);
    }
    
    public void viewEnrolledCourses(){
        System.out.println();
    }

    public void viewGrades(Student student){
        System.out.println(this.grades);
    }

    public double calculateAverageGrade(){
        double sum = 0;
        for(Course course: coursesEnrolled){
            sum += grades.get(course);
        }
        return sum / coursesEnrolled.size();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Student Age: " + getAge());
    }
}
