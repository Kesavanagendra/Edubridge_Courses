package com.practice.OneToManyRelExamples.OneToManyRelExample2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course1_table")
public class Course1 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int courseid;
    @Column(length = 40, nullable = false, unique = true)
    private String coursename;
    @Column(nullable = false)
    private float coursefee;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseid")
    List<Student1> student;
    
    public Course1() {
    }

    public Course1(int courseid, String coursename, float coursefee) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursefee = coursefee;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public float getCoursefee() {
        return coursefee;
    }

    public void setCoursefee(float coursefee) {
        this.coursefee = coursefee;
    }

    @Override
    public String toString() {
        return "Course1 [courseid=" + courseid + ", coursename=" + coursename + ", coursefee=" + coursefee + "]";
    }

    public List<Student1> getStudent() {
        return student;
    }

    public void setStudent(List<Student1> student) {
        this.student = student;
    }
}

