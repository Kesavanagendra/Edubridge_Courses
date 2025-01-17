package com.practice.OneToManyRelExamples.OneToManyRelExample1;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeid;
    @Column(length = 50, nullable = false)
    private String employeename;
    @Column(nullable = false)
    private int employeeage;
    @Column(nullable = false)
    private float employeesalary;
    @Column(length = 50, nullable = false)
    private String employeeemail;
    
    @ManyToOne
    @JoinColumn(name = "departmentid")
    private Department department;

    public Employee() {
    }

    public Employee(int employeeid, String employeename, int employeeage, float employeesalary, String employeeemail) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeage = employeeage;
        this.employeesalary = employeesalary;
        this.employeeemail = employeeemail;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getEmployeeage() {
        return employeeage;
    }

    public void setEmployeeage(int employeeage) {
        this.employeeage = employeeage;
    }

    public float getEmployeesalary() {
        return employeesalary;
    }

    public void setEmployeesalary(float employeesalary) {
        this.employeesalary = employeesalary;
    }

    public String getEmployeeemail() {
        return employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        this.employeeemail = employeeemail;
    }

    @Override
    public String toString() {
        return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeage=" + employeeage
                + ", employeesalary=" + employeesalary + ", employeeemail=" + employeeemail + "]";
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    
    
}
