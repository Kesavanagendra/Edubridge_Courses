package com.practice.ManyToManyRelExample;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "course3_table")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseid;
    @Column(length = 40, nullable = false)
    private String coursename;

    @ManyToMany(mappedBy = "courses")
    
    private List<Stude> students;
    
    public Course() {
    }

    public Course(int courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
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

    @Override
    public String toString() {
        return "Course [courseid=" + courseid + ", coursename=" + coursename + "]";
    }

    public List<Stude> getStudents() {
        return students;
    }

    public void setStudents(List<Stude> students) {
        this.students = students;
    }

    
    
}
