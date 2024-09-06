package com.myProject;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student jade = new Student("Jade", "8989", 16);
        Student james = new Student("James", "8989", 16);
        Student emile = new Student("Emile", "8989", 16);

        ArrayList<Student> students = new ArrayList<>();
        students.add(jade);
        students.add(james);

        Professor prof = new Professor("Shankar", "8989", 16);
        Course lcs = new Course("LCS","CS F214",prof,students);
        Course disco = new Course("Disco","CS F215",prof,students);
        prof.displayDetails();
        System.out.println();
        lcs.displayCourseDetails();
        System.out.println();
        jade.displayDetails();
        System.out.println();
        emile.enrollCourse(lcs);
        disco.enrollStudent(emile);
        lcs.displayCourseDetails();
        System.out.println();
        prof.assignCourse(disco);
        prof.displayDetails();
        System.out.println();
        emile.viewEnrolledCourses();
        System.out.println();
        disco.displayCourseDetails();
        emile.enrollCourse(disco);
        System.out.println();
        emile.displayDetails();
        System.out.println();
    }
}