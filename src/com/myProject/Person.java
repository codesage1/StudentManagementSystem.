package com.myProject;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name != null ? name : "";
        this.id = id != null ? id : "";
        this.age = Math.max(age, 0);
    }

    public Person() {
        this(null,null,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public String getId() {
        return this.id ;
    }

    public void setId(String id) {
        this.id = id != null ? id : "";
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
    }
}
