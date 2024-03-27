package com.practice.OneToManyRelExamples.OneToManyRelExample1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

 @Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentid;
    @Column(length = 50, nullable = false, unique = true)
    private String departmentname;
    @Column(length = 50, nullable = false, unique = true)
    private String departmentlocation;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="departmentid") 
    List<Employee> employee;

    public Department() {
    }

    public Department(int departmentid, String departmentname, String departmentlocation) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.departmentlocation = departmentlocation;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentlocation() {
        return departmentlocation;
    }

    public void setDepartmentlocation(String departmentlocation) {
        this.departmentlocation = departmentlocation;
    }

    @Override
    public String toString() {
        return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
                + ", departmentlocation=" + departmentlocation + "]";
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    
    

}
