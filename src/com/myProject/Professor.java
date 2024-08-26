package com.myProject;

import java.util.List;

public class Professor extends Person {

    private List<Course> coursesTeaching;

    public Professor(String name, String id, int age) {
        super(name, id, age);
    }

    public Professor(List<Course> coursesTeaching) {
        super();
        this.coursesTeaching.addAll(coursesTeaching);
    }

    public void assignCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void getCourses(){
        System.out.println(coursesTeaching);
    }

    public void gradeStudent(Student student, Course course, double grade) {
        student.addGrade(course, grade);
    }

    public void displayProfessor() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
    }
}