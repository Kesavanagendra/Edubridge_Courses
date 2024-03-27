package com.practice.AllRelationExample;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;
    private String studentname;
    private int studentage;
    private float studentfee;

    //relation with subject
    @ManyToMany(mappedBy ="student_subject")
    private Set<Subject> subject = new HashSet<>();

    public Student3() {
    }

    public Student3(int studentid, String studentname, int studentage, float studentfee) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentfee = studentfee;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public float getStudentfee() {
        return studentfee;
    }

    public void setStudentfee(float studentfee) {
        this.studentfee = studentfee;
    }

    @Override
    public String toString() {
        return "Student3 [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
                + ", studentfee=" + studentfee + "]";
    }

    public Set<Subject> getSubject() {
        return subject;
    }

    public void setSubject(Set<Subject> subject) {
        this.subject = subject;
    }

}