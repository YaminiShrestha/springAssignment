package com.ttn.bootcamp.ques6;

public class Employee {
    private int id;
    private String name;

    public Employee() {
        System.out.println("Default Constructor");
    }

    //  Constructor injection
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // This method will display id and name of employee
    void display() {
        System.out.println(id + " " + name);
    }
}