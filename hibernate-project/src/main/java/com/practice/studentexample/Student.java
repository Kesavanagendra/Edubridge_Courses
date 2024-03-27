package com.practice.studentexample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //helps to conver class student to table
@Table(name="stu_table")// If we want to change the table name.
public class Student {

	@Id //primary key
	// @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int sid; 
	String sname;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
}
