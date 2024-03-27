package com.practice.AllRelationExample;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int teacherid;
    private String teachername;
    private Float teachersalary;

    //related with subject
    @OneToMany(mappedBy = "teacher")
    private Set<Subject> subject = new HashSet<>();

    public Teacher() {
    }

    public Teacher(int teacherid, String teachername, Float teachersalary) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.teachersalary = teachersalary;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public Float getTeachersalary() {
        return teachersalary;
    }

    public void setTeachersalary(Float teachersalary) {
        this.teachersalary = teachersalary;
    }

    @Override
    public String toString() {
        return "Teacher [teacherid=" + teacherid + ", teachername=" + teachername + ", teachersalary=" + teachersalary
                + "]";
    }

    public Set<Subject> getSubject() {
        return subject;
    }

    public void setSubject(Set<Subject> subject) {
        this.subject = subject;
    }

    

    
    
}
