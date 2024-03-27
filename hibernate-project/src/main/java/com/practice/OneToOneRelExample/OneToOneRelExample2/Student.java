package com.practice.OneToOneRelExample.OneToOneRelExample2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;

    @Column(length = 40, nullable = false)
    private String studentname;

    @OneToOne
    @JoinColumn(name = "courseid")
    Course course;

    public Student() {
    }

    public Student(int studentid, String studentname) {
        this.studentid = studentid;
        this.studentname = studentname;
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

    @Override
    public String toString() {
        return "Student [studentid=" + studentid + ", studentname=" + studentname + "]";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    
}
