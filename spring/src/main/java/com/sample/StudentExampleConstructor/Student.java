package com.sample.StudentExampleConstructor;

public class Student {

    private int id;
    private String name;

    // public Student(){
        
    // }

    public Student(int id, String name){
        this.id = id;
        this.name = name;

    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

    
    
}
