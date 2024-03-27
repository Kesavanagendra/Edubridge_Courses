package com.practice.OneToManyRelExamples.OneToManyRelExample2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student1_table")
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;

    @Column(length = 40, nullable = false)
    private String studentname;
    @Column(nullable = false)
    private int studentage;
    @Column(length = 40, nullable = false, unique = true)
    private String studentemail;
    
    @ManyToOne
    @JoinColumn(name = "courseid")
    private Course1 course;

    public Student1() {
    }

    public Student1(int studentid, String studentname, int studentage, String studentemail) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentemail = studentemail;
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

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    @Override
    public String toString() {
        return "Student1 [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
                + ", studentemail=" + studentemail + "]";
    }

    public Course1 getCourse() {
        return course;
    }

    public void setCourse(Course1 course) {
        this.course = course;
    }
}
