package com.practice.AllRelationExample;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectid;
    private String subjectname;
    
    //relation with student
    // @ManyToOne
    @OneToMany
    @JoinTable(name = "student_subject", joinColumns = {
        @JoinColumn(name = "studentid")}, inverseJoinColumns={@JoinColumn(name = "subjectid")})
    // private Student3 students;
    Set<Student3> student_subject = new HashSet<>();

    //relation with teacher
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacherid")
    private Teacher teacher;

    public Subject() {
    }

    public Subject(int subjectid, String subjectname) {
        this.subjectid = subjectid;
        this.subjectname = subjectname;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public String toString() {
        return "Subject [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
    }

    public Set<Student3> getStudent_subject() {
        return student_subject;
    }

    public void setStudent_subject(Set<Student3> student_subject) {
        this.student_subject = student_subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

   

    

    

    

    
    
}
