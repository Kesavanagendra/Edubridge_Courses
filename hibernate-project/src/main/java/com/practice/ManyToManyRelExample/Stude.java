package com.practice.ManyToManyRelExample;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stud3_table")
public class Stude {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;
    @Column(length = 40, nullable = false)
    private String studentname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stu_course", joinColumns = {
        @JoinColumn(name = "studentid")}, inverseJoinColumns = {@JoinColumn(name = "courseid")})
    private List<Course> courses;
    
    public Stude() {
    }

    public Stude(int studentid, String studentname) {
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
        return "Stude [studentid=" + studentid + ", studentname=" + studentname + "]";
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
