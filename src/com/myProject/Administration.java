package com.myProject;

import java.util.ArrayList;
import java.util.List;

public class Administration {
    private final String adminName;
    private final String adminPassword;
    private final String adminId;
    private final List<Course> courseList = new ArrayList<Course>();
    private final List<Student> studentList = new ArrayList<Student>();
    private final List<Professor> professorList = new ArrayList<Professor>();

    public Administration(String adminName, String adminPassword, String adminId) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminId = adminId;
    }

    public Administration() {
        this("","","");
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addProfessor(Professor professor){
        professorList.add(professor);
    }
    public void addCourse(Course course){
        courseList.add(course);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }
    public void removeProfessor(Professor professor){
        professorList.remove(professor);
    }
    public void removeCourse(Course course){
        courseList.remove(course);
    }

    public void displayAdminDetails() {
        System.out.println("Admin Name: " + adminName);
        System.out.println("Admin Id: " + adminId);
    }
}
