package com.practice.OneToOneRelExample.OneToOneRelExample2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course_table")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int courseid;
    @Column(length = 40, nullable = false, unique = true)
    private String coursename;
    @Column(nullable = false)
    private float coursefee;
    
    public Course() {
    }

    public Course(int courseid, String coursename, float coursefee) {
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
        return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursefee=" + coursefee + "]";
    }

    
}
