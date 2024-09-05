package com.myProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {

    // want at max 5 courses,will see later.
    private final List<Course> coursesEnrolled = new ArrayList<>(5);
    private final Map<Course, Double> grades = new HashMap<>();

    public Student(String name, String id, int age) {
        super(name, id, age);
    }
    public Student(String name, String id, int age, List<Course> coursesEnrolled) {
        super(name, id, age);
        if(coursesEnrolled.size() < 5){
            this.coursesEnrolled.addAll(coursesEnrolled);
        } else {
            throw new IllegalArgumentException("Cannot enroll in more than 5 courses");
        }
    }

    public void enrollCourse(Course course){
        if(!coursesEnrolled.contains(course) && !grades.containsKey(course) && coursesEnrolled.size() < 5){
            coursesEnrolled.add(course);
        } else {
            throw new IllegalArgumentException("Cannot enroll in more than 5 courses or already enrolled/completed courses");
        }
    }

    public void addGrade(Course course, Double grade){
        if(coursesEnrolled.contains(course))
            grades.put(course, grade);
        else System.out.println("Not enrolled course");
    }
    
    public void viewEnrolledCourses(){
        for(Course course: coursesEnrolled){
            System.out.println(course);
        }
    }

    public void viewGrades(Student student){
        for(Map.Entry<Course, Double> entry: grades.entrySet()){
            System.out.println("Course: " + entry.getKey() + " Grade: " + entry.getValue());
        }
    }

    public double calculateAverageGrade(){
        double sum = 0;
        int count = 0;
        if(grades.isEmpty()) return 0;
        for(Course course: coursesEnrolled){
            Double grade = grades.get(course);
            sum += grade;
            count++;
        }
        return sum / count;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Student Age: " + getAge());
    }
}
