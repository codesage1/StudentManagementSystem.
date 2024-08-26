package com.myProject;

import java.util.List;

public class Administration {
    private String adminName;
    private String adminPassword;
    private String adminId;
    private List<Course> courseList;
    private List<Student> studentList;
    private List<Professor> professorList;

    public Administration(String adminName, String adminPassword, String adminId) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminId = adminId;
    }

    public Administration() {
        this(null,null,null);
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
        System.out.println("Admin Password: " + adminPassword);
        System.out.println("Admin Id: " + adminId);
    }
}
